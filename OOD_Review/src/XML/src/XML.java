import java.util.Map;

public abstract class XML {
    protected String tagName;
    protected String tagValue = "";
    protected Map<String, String> atrributeList;

    public XML(String tagName, String tagValue, Map<String, String> atrributeList) {
        this.tagName = tagName;
        this.tagValue = tagValue;
        this.atrributeList = atrributeList;
    }
    public XML(String tagName, Map<String, String> atrributeList) {
        this.tagName = tagName;
        this.atrributeList = atrributeList;
    }

    public void add(XML xml){
        throw new UnsupportedOperationException();
    }
    public abstract String generateHtml();

}
