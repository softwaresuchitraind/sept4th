//26. How do you find the most repeated word in a text file in java?

import java.io.*;
import java.util.*;

class Q26
{
	public static void main(String[] args) 
	{
		try(FileReader fin = new FileReader("test1.txt");
			BufferedReader bin = new BufferedReader(fin))
		{
			HashMap<String, Integer> map = new HashMap<>();
			String line = bin.readLine();
			while(line != null)
			{
				for(String word : line.split("\\s+"))
				{
					if(map.get(word) == null)
					{
						map.put(word, 1);
					}
					else
					{
						map.put(word, map.get(word) + 1);
					}
				}
				line = bin.readLine();
			}
			System.out.println(map);
			
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			ArrayList<Map.Entry<String, Integer>> list = 
				new ArrayList(entries);
			Collections.sort(list, (e1, e2) -> e2.getValue() - e1.getValue());
			System.out.println("most repated word: " + list.get(0).getKey());
			
		}

		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}