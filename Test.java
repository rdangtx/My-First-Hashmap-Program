import java.util.Random;
import java.util.Scanner;
import java.io.*;
/**
* @author	Richard Dang
*
* @param
* @return
*/

public class Test
{
	public static void main( String[] args ) throws FileNotFoundException, IOException
	{
		HashMap testMap = new HashMap();
		Random rnd = new Random();
		File file = new File("num.txt");
		Writer wr = new FileWriter("num.txt");

		for (int i=0; i<=127; i++)
		{
			testMap.put(i,rnd.nextInt());
			wr.write(String.valueOf(testMap.get(i)));

			if (testMap.get(i)%2 == 0)
			{
				System.out.println(testMap.get(i) + " is even.");
				wr.write(" is even.");
				wr.write(System.lineSeparator());
			}
			else
			{
				System.out.println(testMap.get(i) + " is odd.");
				wr.write(" is odd.");
				wr.write(System.lineSeparator());
			}
		}
		wr.close();	
	}
}