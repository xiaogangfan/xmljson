import net.sf.json.xml.XMLSerializer;

/**
 * created by xiaogangfan
 * on 16/10/27.
 */
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class T {
    private static final String STR_JSON = "{\"name\":\"Michael\",\"address\":{\"city\":\"Suzou\",\"street\":\" Changjiang Road \",\"postcode\":100025},\"blog\":\"http://www.ij2ee.com\"}";
    public static String xml2JSON(String xml){
        return new XMLSerializer().read(xml).toString();
    }

    public static String json2XML(String json){
        net.sf.json.JSONObject jobj = net.sf.json.JSONObject.fromObject(json);
        String xml =  new XMLSerializer().write(jobj);
        return xml;
    }

    public static void main(String[] args) {
        String xml = json2XML(STR_JSON);
        System.out.println("xml = "+xml);
        String json = xml2JSON(xml);
        System.out.println("json="+json);
    }
}
