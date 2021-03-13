import java.io.*;
class PrintWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("durga");
		pw.flush();
		pw.close();
	}
}
/* OUTPUT:
	d100
	true
	c
	durga
*/