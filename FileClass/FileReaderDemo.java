import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		
		System.out.println("=================");
		
		FileReader fr1=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr1.read(ch);
		for(char element:ch)
			System.out.print(element);
	}
}