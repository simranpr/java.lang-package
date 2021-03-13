import java.io.*;
class Test
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("abc.txt"); //This statement doesn't create file but creates a java obj f which is pointing to file abc.txt
		System.out.println(f.exists()); //false 
		f.createNewFile(); //This will create a file
		System.out.println(f.exists()); //true
		File f1= new File("directorydemo"); //f1 is pointing to directory
		System.out.println(f1.exists());//false
		f1.mkdir(); //creates a directory
		System.out.println(f1.exists()); //true
	}
}