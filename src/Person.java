import java.io.*;
public class Person 
{
    static int age;
	Person(int initialAge)
	{
		if(initialAge>0)
		    age=initialAge;
		else
		{
			System.out.println("Age is not valid");
			age=0;
	    }
	}
	void yearsPass()
	{
		age++;
	}
	void amIOld()
	{
		if(age<13)
			System.out.println("You are young!");
		else if(age>=13 && age<18)
			System.out.println("You are a teenager!!");
		else if(age>18)
			System.out.println("You are Old!!!");
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the age");
		age=Integer.parseInt(br.readLine());
		Person obj=new Person(age);
		obj.amIOld();
		for(int i=0;i<13;i++)
			obj.yearsPass();
		obj.amIOld();
		

	}

}
