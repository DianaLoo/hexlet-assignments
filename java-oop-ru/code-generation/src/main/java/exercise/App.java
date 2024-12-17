package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
//import java.nio.file.StandardOpenOption;
import com.fasterxml.jackson.databind.ObjectMapper;
// BEGIN
class App {
    //public static save(Path filePath, Car car) {
        private static final ObjectMapper objectMapper = new ObjectMapper();

        public static void save(Path filePath, Car car) {
            try {
                String file = objectMapper.writeValueAsString(car);
                Files.writeString(filePath, file);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public static Car extract(Path filePath) {
            try {
                String file = Files.readString(filePath);
                return objectMapper.readValue(file, Car.class);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }
// END
