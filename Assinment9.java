import java.io.*;
class Assignment9 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("demo.txt");
		System.out.println(f.exists());
		
		//f.createNewFile();

		//System.out.println(f.exists());

		String s = f.getAbsolutePath();
		System.out.println(s);
	}
}