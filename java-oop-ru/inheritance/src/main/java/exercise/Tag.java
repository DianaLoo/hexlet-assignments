package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    String tag;
    Map<String, String> map;

    public Tag(String tag, Map<String, String> map) {
        this.tag = tag;
        this.map = map;
    }
    public String getTag() {
            return tag;
}
public void setTag(String tag) {
            this.tag = tag;
        }

        public Map<String, String> getMap() {
            return map;
        }

        public void setMap(Map<String, String> map) {
            this.map = map;
        }


        public String toSting() {
        return "";
        }
}


// END

