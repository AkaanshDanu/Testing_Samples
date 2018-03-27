import java.io.*;
public class PrimeFac 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter the number");
		num=Integer.parseInt(br.readLine());
		System.out.println("Prime Factors are:");
		while (num%2==0)
	        {
	            System.out.print(2 + " ");
	            num /= 2;
	        }
	    for (int i = 3; i <= Math.sqrt(num); i+= 2)
	        {
	            while (num%i == 0)
	            {
	                System.out.print(i + " ");
	                num /= i;
	            }
	        }
	        if (num > 2)
	            System.out.print(num);
	}

}
