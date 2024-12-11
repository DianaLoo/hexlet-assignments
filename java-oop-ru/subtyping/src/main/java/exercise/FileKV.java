package exercise;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;

// BEGIN
class FileKV implements KeyValueStorage {
    String filepath;
    private final Map<String, String> map;

    FileKV(String path, Map<String, String> data) {
        this.filepath = path;
        this.map = new HashMap<>(data);
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
// END
