//Ques. WAP to merge data from two files into third file.
import java.io.*;
class FileMerger
{
	public static void main(String[] args)throws IOException
	{
		File f1=new File("file1.txt");
		f1.createNewFile();
		File f2=new File("file2.txt");
		f2.createNewFile();
		File f3=new File("file3.txt");
		f3.createNewFile();
		
		PrintWriter pw=new PrintWriter(f3);
		BufferedReader br1=new BufferedReader(new FileReader(f1));
		BufferedReader br2=new BufferedReader(new FileReader(f2));
		
		String line1=br1.readLine();
		while(line1 != null)
		{
			pw.println(line1);
			line1=br1.readLine();
		}
		
		String line2=br2.readLine();
		while(line2 != null)
		{
			pw.println(line2);
			line2=br2.readLine();
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}
}
/* OUTPUT:
	a
	b
	c
	d
	1
	2
	3
	4
	5
*/