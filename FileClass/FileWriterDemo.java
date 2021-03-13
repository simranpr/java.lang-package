import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("abc.txt");
		fw.write(100); //d
		fw.write("urga\nSoftwareSolutions");//urga SoftwareSolutions
		fw.write("\n");
		char[] ch={'a','b','c','d'};
		fw.write(ch); //abcd
		fw.write("\n");
		fw.flush();
		fw.close();
		System.out.println("Data added successfully");
	}
}
/* OUTPUT
   ------
   durga
   SoftwareSolutions
   abcd
   
   If Line 6: FileWriter fw=new FileWriter("abc.txt",true)
   then the data will be appended with existing file data.
*/
