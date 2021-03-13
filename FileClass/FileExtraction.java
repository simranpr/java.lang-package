import java.io.*;
class FileExtraction
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter pw=new PrintWriter("final.txt");
		BufferedReader br1=new BufferedReader(new FileReader("total.txt"));
		
		String line1=br1.readLine();
		while(line1 != null)
		{
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
			String target=br2.readLine();
			while(target != null)
			{
				if(line1.equals(target))
				{
					available = true;
					break;
				}
				target=br2.readLine();
			}
			if(available == false)
				pw.println(line1);
				
			line1=br1.readLine();
		}
		pw.flush();
		br1.close();
		pw.close();
	}
}
/* OUTPUT:
	1
	3
	4
	6
	7
	9
*/