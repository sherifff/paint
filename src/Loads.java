
import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Sherif
 */
public class Loads {
    public ArrayList loadFilejson(ArrayList<Shapes>shapes,String url){
//             JFileChooser chosser = new JFileChooser();
//            chosser.showDialog(null, "Get file");
//            File file = chosser.getSelectedFile();
           // File chosenFile = new File(file.getAbsolutePath());
            shapes.clear();
      //      repaint();
            try{
            JSONParser jsonParser = new JSONParser();
            FileReader fileReader = new FileReader(url);
            JSONObject block = (JSONObject) jsonParser.parse(fileReader);
            JSONArray shapess = new JSONArray();
           
            shapess=(JSONArray) block.get("Shapes");
             System.out.println(shapess.size());
          //  System.out.println("*********************************");
            for(int y=0;y<shapess.size();y++){
                JSONObject shape = new JSONObject();
                shape=(JSONObject) shapess.get(y);
                Shapes generalShape2 = new Shapes();     
                int x1=Integer.parseInt((String)shape.get("x1"));
                int y1=Integer.parseInt((String)shape.get("y1"));
                int x2=Integer.parseInt((String)shape.get("x2"));
                int y2=Integer.parseInt((String)shape.get("y2"));
                 Color c;
                 c = Color.decode((String)shape.get("color"));
                //  System.out.println(c);
                   int thikk =Integer.parseInt((String)shape.get("thikness"));;
                    int type = 0;
                    if (((String)shape.get("type")).equals("Circle")) {
                        type = 2;
                        generalShape2 = new Circle(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Brush")) {
                        type = 1;
                        generalShape2 = new Brush(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Ellipse")) {
                        type = 3;
                        generalShape2 = new Ellipse(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Line")) {
                        type = 4;
                        generalShape2 = new Line(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Rectangle")) {
                        type = 5;
                        generalShape2 = new Rectangle(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Square")) {
                        type = 6;
                        generalShape2 = new Square(x1, y1, x2, y2);
                    } else if (((String)shape.get("type")).equals("Triangle")) {
                        type = 7;
                        generalShape2 = new Triangle(x1, y1, x2, y2);
                    }
                    generalShape2.setX1(x1);
                    generalShape2.setY1(y1);
                    generalShape2.setX2(x2);
                    generalShape2.setY2(y2);
                    generalShape2.setThik(thikk);
                    generalShape2.setColor(c);
                    generalShape2.setType(type);
                    if (((String)shape.get("filled")).equals("true")) {
                        generalShape2.setFill(true);
                    } else {
                        generalShape2.setFill(false);
                    }

                    shapes.add(generalShape2);
                    
                    generalShape2 = null;
                
            }
            
            
        //      repaint();
            }catch(Exception e){
                
            }
        return shapes;
    }
    public ArrayList loadFilexml(ArrayList<Shapes>shapes,String url){
              try {
//            JFileChooser chosser = new JFileChooser();
//            chosser.showDialog(null, "Get file");
//            File file = chosser.getSelectedFile();
            File chosenFile = new File(url);
            shapes.clear();
           // generalShape = null;
            //repaint();
            DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
            Document doc1 = dBuilder1.parse(chosenFile);
            doc1.getDocumentElement().normalize();
            NodeList nList = doc1.getElementsByTagName("Shape");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Shapes generalShape1 = new Shapes();
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    int x1 = Integer.parseInt(eElement.getElementsByTagName("x1").item(0).getTextContent());
                    int y1 = Integer.parseInt(eElement.getElementsByTagName("y1").item(0).getTextContent());
                    int x2 = Integer.parseInt(eElement.getElementsByTagName("x2").item(0).getTextContent());
                    int y2 = Integer.parseInt(eElement.getElementsByTagName("y2").item(0).getTextContent());
                    int type = 0;
                    //    System.out.println(x1+" "+x2+" "+y1+" "+y2);
                    Color c = Color.decode(eElement.getElementsByTagName("color").item(0).getTextContent());
                    int thikk = Integer.parseInt(eElement.getElementsByTagName("thikness").item(0).getTextContent());
                    if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Circle")) {
                        type = 2;
                        generalShape1 = new Circle(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Brush")) {
                        type = 1;
                        generalShape1 = new Brush(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Ellipse")) {
                        type = 3;
                        generalShape1 = new Ellipse(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Line")) {
                        type = 4;
                        generalShape1 = new Line(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Rectangle")) {
                        type = 5;
                        generalShape1 = new Rectangle(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Square")) {
                        type = 6;
                        generalShape1 = new Square(x1, y1, x2, y2);
                    } else if (eElement.getElementsByTagName("type").item(0).getTextContent().equalsIgnoreCase("Triangle")) {
                        type = 7;
                        generalShape1 = new Triangle(x1, y1, x2, y2);
                    }
                    generalShape1.setX1(x1);
                    generalShape1.setY1(y1);
                    generalShape1.setX2(x2);
                    generalShape1.setY2(y2);
                    generalShape1.setThik(thikk);
                    generalShape1.setColor(c);
                    generalShape1.setType(type);
                    if (eElement.getElementsByTagName("filled").item(0).getTextContent().equals("true")) {
                        generalShape1.setFill(true);
                    } else {
                        generalShape1.setFill(false);
                    }

                    shapes.add(generalShape1);
//                    System.out.println(generalShape1.getX1());
//                    System.out.println(generalShape1.getX2());
//                    System.out.println(generalShape1.getY1());
//                    System.out.println("*********************************");
//                    System.out.println(shapes.size());
                }


                generalShape1 = null;
            }
//            for(int i=0;i<shapes.size();i++){
//                System.out.println(shapes.get(i).getX1());
//            }
//            
         //   repaint();

        } catch (Exception e) {
            //  e.printStackTrace();
        }
        return shapes;
    }
}
