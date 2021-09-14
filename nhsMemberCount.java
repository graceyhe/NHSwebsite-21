import java.util.*;
import java.io.*;
public class nhsMemberCount
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("spring_semester_data.txt"));
		String loop="";
		while(!loop.equals("Fall Semester Data"))
		{
			loop=br.readLine();
			//System.out.println(loop);
		}
		int count=0;
		loop = br.readLine();
		while(!loop.equals(""))
		{
			//System.out.println(loop);
			//System.out.println(loop.substring(loop.indexOf("sac")-1,loop.indexOf("sac")));
			int sacs = Integer.parseInt(loop.substring(loop.indexOf("sac")-1,loop.indexOf("sac")));
			if(sacs<3)
			{
				count++;
				System.out.println(count);
			}
			else
				System.out.println(loop);
			loop = br.readLine();
			if(loop == null)
				loop = "";
		}
		System.out.println(count);
		
	}
}