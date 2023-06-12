import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TagNode extends XML{


    public TagNode(String tagName, String tagValue, Map<String, String> atrributeList) {
        super(tagName, tagValue, atrributeList);
    }

    public TagNode(String tagName, Map<String, String> atrributeList) {
        super(tagName, atrributeList);
    }

    @Override
    public String generateHtml() {

        String attribute = "";
        for (Map.Entry<String, String> entry : atrributeList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            attribute += " " + key + " = '" + value + "'";

        }
        return "\t<" + tagName + attribute + ">" + tagValue + "</" + tagName + ">";
    }
}
