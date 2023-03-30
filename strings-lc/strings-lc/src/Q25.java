//25. How do you find the number of characters, 
//words and lines in the given text file in java?
import java.io.*;
class Q25
{
	public static void main(String[] args) 
	{
		try(FileReader fin = new FileReader("test1.txt");
			BufferedReader bin = new BufferedReader(fin))
		{
			int linesCount = 0;
			int wordsCount = 0;
			int charsCount = 0;
			String line = bin.readLine();
			while(line != null)
			{
				linesCount++;
				wordsCount += line.split("\\s+").length;
				charsCount += line.length();
				line = bin.readLine();
			}
			System.out.println("lines count: " + linesCount);
			System.out.println("words count: " + wordsCount);
			System.out.println("chars count: " + charsCount);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}