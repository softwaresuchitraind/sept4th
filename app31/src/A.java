import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import com.sun.org.apache.xml.internal.serialize.*;
class A 
{
	public static void main(String[] args)
	throws Exception
	{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		//printing statement we can define a bulider
		DocumentBuilder db=dbf.newDocumentBuilder();
		//
		Document doc=db.newDocument();
		Element root=doc.createElement("books");
		Element child1=doc.createElement("book");
		Text t1=doc.createTextNode("Xml book");
		child1.appendChild(t1);
		root.appendChild(child1);
		doc.appendChild(root);
		Element child2=doc.createElement("book");
		Text t2=doc.createTextNode("spring book");
		child2.appendChild(t2);
		root.appendChild(child2);
		OutputFormat format=new OutputFormat(doc);
		format.setIndenting(true);
		File f1=new File("books1.xml");
		FileOutputStream fout=new FileOutputStream(f1);
		//define outputstram writing some content in XML
		XMLSerializer serializer =new XMLSerializer(fout,format);
		serializer.serialize(doc);
		System.out.println("done");
		
	}
}
