import java.io.*;
public class DetermineInt 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter the number");
		num=Integer.parseInt(br.readLine());
		if(num%2==0)
		{
			if(num>=2 && num<=5)
				System.out.println("Not Weird");
			else if(num>=6 && num<=20)
				System.out.println("Weird");
			else if(num>20)
				System.out.println("Not Weird");
		}
		else
			System.out.println("Weird");
	}

}
