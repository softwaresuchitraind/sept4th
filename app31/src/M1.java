//SAX parser--reading
import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
class  A extends DefaultHandler
{
	public void startElement(String uri,
						String localName,
						String qName,
						Attributes attrs)
					throws SAXException
	{
	System.out.println("from startElement:"+qName);
	}
	public void characters(char[]chars,int start, int length)
	{
		System.out.println("from Characters");
		System.out.println("Start :"+start);
		System.out.println("length :"+length);
		String s1=new String(chars,start,length);
		System.out.println("chars"+s1);
	}
	public void endElement(String uri,String localName,String qName)throws SAXException
	{
		System.out.println("from endElement:"+qName);
	}
}
class M1
{
	public static void main(String []args)throws Exception
	{
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser parser =spf.newSAXParser();
		parser.parse("books1.xml",new A());//supply xml file, default handler-reading starting ,body,end
		System.out.println("done");
	}
}
/*
Based on the event corresponding method are calling
SAx parser reading entire xml file from top to bottom.
while reading it is calling linstiners
We need to supply lisner method object
*/