import java.util.*;
import java.io.*;
public class nhsdata
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("spring_semester_data.txt"));
		//PrintWriter out = new PrintWriter(new File("spring_semester_data_blank"));
		String loop="";
		while(!loop.equals("Old Members"))
		{
			loop=br.readLine();
			//out.println(loop);
			System.out.println(loop);
		}
		loop = br.readLine();
		while(!loop.equals(""))
		{
			String current = loop;
			int hrs = (int)Double.parseDouble(current.substring(current.indexOf("12g")+6,current.indexOf("hr")));
			int required = 10;
			if(hrs<10)
			{
				required+=(10-hrs)*2;
			}
			current = current.substring(0,current.indexOf("12g")+6)+"0/"+required+current.substring(current.indexOf("hr")+2,current.indexOf("|")+1);
			current = current.substring(0,current.indexOf("sac")-1)+"0"+current.substring(current.indexOf("sac"),current.indexOf("sac")+4)+current.substring(current.indexOf("|"));
			int NHShrs = Integer.parseInt(current.substring(current.indexOf("/5")-1,current.indexOf("/5")));
			int requiredNHS = 5;
			if(NHShrs<5)
			{
				requiredNHS+=(5-NHShrs)*2;
			}
			current = current.substring(0,current.indexOf("/5")-1)+"0/"+requiredNHS+current.substring(current.indexOf("/5")+2);
			//out.println(current);
			System.out.println(current);
			loop = br.readLine();
		}
		//out.close();
	}
}