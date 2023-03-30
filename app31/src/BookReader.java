import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.util.*;
class  BookReader extends DefaultHandler//All listener objects are inherting
{
	ArrayList books=new ArrayList();
	Book book=null;
	String content=null;//content 
	
	public void startElement(String uri,
						String localName,
						String qName,
						Attributes attrs)
					throws SAXException
	{
		if("book".equals(qName))
		{
		 book=new Book();
		 book.id=attrs.getValue("id");//2
		}
		if("price".equals(qName))
		{
		
		 book.reduction=attrs.getValue("reduction");//3---is starting tag is price store reduction value 
		}
		
	
	}
	//calling before ending tag
	public void characters(char[]chars,int start, int length)
	{
		
		
		 content =new String(chars,start,length);//specify global string content
		
	}
	public void endElement(String uri,String localName,String qName)throws SAXException
	{
		if("title".equals(qName))
		{
		 
		 book.title=content;//take the content assign them to title
		 
		}
		if("author".equals(qName))
		{
		
		 book.author=content;//content is prince if ending tg is auther
		}
		if("price".equals(qName))
		{
		
		 book.price=content;//if end tag is price assign then content it to book.price---500
		}
		
		if("book".equals(qName))
		{
		
		 books.add(book);//if end tag is book assign it to books which is a ArrayList
		}
		
	}
}