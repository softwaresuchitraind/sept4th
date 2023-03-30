import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
class  B extends DefaultHandler
{
	public void startElement(String uri,
						String localName,
						String qName,
						Attributes attrs)
					throws SAXException
	{
	 System.out.println("from startElement:"+qName);
	 String id=attrs.getValue("id");//attribute name-id
	 String reduction=attrs.getValue("reduction");
	 System.out.println("id value : " +id);
	 System.out.println("reduction value : " +reduction);
	}
	public void characters(char[]chars,int start, int length)
	{
		System.out.println("from Characters");
		System.out.println("Start :"+start);
		System.out.println("length :"+length);
		String s1=new String(chars,start,length);
		System.out.println("chars :" +s1);
	}
	public void endElement(String uri,String localName,String qName)throws SAXException
	{
		System.out.println("from endElement:"+qName);
	}
}
class M3
{
	public static void main(String []args)throws Exception
	{
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser parser =spf.newSAXParser();
		parser.parse("books3.xml",new B());//two arguments xml file, listner method
		System.out.println("done");
	}
}

/*
create a java class -book
property
id 
tilte
autor
reduction

create a book object store data in array
create book object


*/