//Ques. WAP to merge data from two files into third file line by line.
import java.io.*;
class FileMerger2
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("file3.txt");
		BufferedReader br1=new BufferedReader("file1.txt");
		BufferedReader br2=new BufferedReader("file2.txt");
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		while((line1 !=null) || (line2 !- null))
		{
			if(line1 != null)
			{
				pw.write(line1);
				line1=br1.readLine();
			}
			if(line2 !- null)
			{
				pw.println(line2);
				line2=br.readLine();
			}
		}
		pw.flush();
		pw.close();
		br1.close();
		br2.close();
		br2.close();
	}
}
/* OUTPUT:
	a
	1
	b
	2
	c
	3
	d
	4
	5
*/