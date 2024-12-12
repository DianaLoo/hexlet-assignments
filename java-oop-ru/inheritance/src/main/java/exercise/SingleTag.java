package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String tag, Map<String, String> map) {
        super(tag, map);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("<").append(tag);

        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
            }
        }
        str.append(">");
        return str.toString();
    }
}
// END
