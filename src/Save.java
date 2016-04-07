
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;

/**
 *
 * @author Sherif
 */
public class Save {
    public void savexml(Document doc,String url) throws TransformerConfigurationException, TransformerException{
        try{
          TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
               DOMSource source = new DOMSource(doc);
               StreamResult result = new StreamResult(url);
               transformer.transform(source, result);
        }catch(Exception e){
            
        }
        
    }
     public void savejson(String url,JSONObject obj2) throws IOException{
         try{
         FileWriter jsonFileWriter = new FileWriter(url);
                     jsonFileWriter.write(obj2.toJSONString());
	            jsonFileWriter.flush();
	            jsonFileWriter.close();
                     }catch(Exception e){
            
        }
    }
}
