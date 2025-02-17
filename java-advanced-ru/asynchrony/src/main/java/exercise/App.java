package exercise;

import java.util.concurrent.CompletableFuture;
import java.util.Arrays;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.StandardOpenOption;

class App {

    // BEGIN
    public static CompletableFuture<String> unionFiles(String pathFile1, String pathFile2, String pathFileResult) {
        CompletableFuture<String> futureFile1 = CompletableFuture.supplyAsync(() -> {
            Path filePath = Paths.get(pathFile1).toAbsolutePath();
            try {
                return Files.readString(filePath);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> futureFile2 = CompletableFuture.supplyAsync(() -> {
            Path filePath = Paths.get(pathFile2).toAbsolutePath();
            try {
                return Files.readString(filePath);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return futureFile1.thenCombine(futureFile2, (file1, file2) -> {
            Path filePath = Paths.get(pathFileResult).toAbsolutePath();
            try {
                Files.writeString(filePath, file1 + file2, StandardOpenOption.CREATE);
                return file1 + " " + file2;
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).exceptionally(ex -> {
            System.out.println(ex.getMessage());
            return null;
        });
    }
    // END

    public static void main(String[] args) throws Exception {
        // BEGIN
        String result = unionFiles("src/main/resources/file1.txt",
                "src/main/resources/file2.txt",
                "src/main/resources/result.txt").get();
        System.out.println();
        // END
    }
}

