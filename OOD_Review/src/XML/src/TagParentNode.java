import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TagParentNode extends XML{
    List<XML> otherNodes = new ArrayList<>();

    public TagParentNode(String tagName, String tagValue, Map<String, String> atrributeList) {
        super(tagName, tagValue, atrributeList);
    }

    public TagParentNode(String tagName, Map<String, String> atrributeList) {
        super(tagName, atrributeList);
    }


    @Override
    public void add(XML xml) {
        otherNodes.add(xml);
    }

    @Override
    public String generateHtml() {
        StringBuilder attributeBuilder = new StringBuilder();
        StringBuilder nodeHtmlBuilder = new StringBuilder();

        // Tạo chuỗi thuộc tính
        for (Map.Entry<String, String> entry : atrributeList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            attributeBuilder.append(" ").append(key).append("=\"").append(value).append("\"");
        }

        // Tạo chuỗi HTML của các nút con
        for (XML node : otherNodes){
            nodeHtmlBuilder.append(node.generateHtml()).append("\n");
        }

        // Tạo chuỗi HTML cho thẻ cha
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("<").append(tagName).append(attributeBuilder).append(">\n");
        resultBuilder.append(nodeHtmlBuilder);
        resultBuilder.append(tagValue);
        resultBuilder.append("</").append(tagName).append(">");

        return resultBuilder.toString();
    }
}
