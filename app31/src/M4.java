import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.util.*;
class M4
{
	public static void main(String []args)throws Exception
	{
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser parser =spf.newSAXParser();
		BookReader br=new BookReader();//Defining BookReader
		parser.parse("books3.xml",br);//supplying parse method
		for(Object obj:br.books)//we are reading content of the arraylist through enhanced for loop
		{
			Book book=(Book)obj;
			System.out.print(book.id+ "\t");
			System.out.print(book.title+ "\t");
			System.out.print(book.author+ "\t");
			System.out.print(book.price+ "\t");
			System.out.print(book.reduction+ "\t");
			System.out.println();
		}  
		System.out.println("done");
	}
}