import java.io.*;
//It will print all directory and file names present in specified directory
class Test
{
	public static void main(String[] args)
	{
		int count=0;
		File f=new File("C:\\Program Files");
		String[] s=f.list();
		for(String name:s)
		{
			count++;
			System.out.println(name);
		}
		System.out.println("Total items present in Program Files:"+count);
	}	
}
//It will print file names present in specified directory
class Test
{
	public static void main(String[] args)
	{
		int count=0;
		File f=new File("C:\\Program Files");
		String[] s=f.list();
		for(String filename:s)
		{
			File f1=new File(f,filename);
			if(f1.isFile()) //to print directory names replace isFile() with isDirectory()
			{
				count++;
				System.out.println(filename);
			}
		}
		System.out.println("Total files:"+count);
	}
}
