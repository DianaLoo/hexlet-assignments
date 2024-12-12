package exercise;

import java.util.Map;
import java.util.List;
//import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    String body;
    List<Tag> children;

    public PairedTag(String tag, Map<String, String> map, String body, List<Tag> children) {
        super(tag, map);
        this.body = body;
        this.children = children;
    }

    public String getBody() {
        return body;
    }

    public List<Tag> getChildren() {
        return children;
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
        str.append(">").append(body);
        if (children != null) {
            for (Tag child : children) {
                str.append(child.toString());
            }
        }
                str.append("</").append(tag).append(">");
        return str.toString();
    }
}
// END
