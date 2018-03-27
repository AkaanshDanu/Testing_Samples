import java.io.*;
public class TotMealCost 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tipPercent,taxPercent;
		double mealPrice,tipval,taxval,total;
		System.out.println("Enter the meal cost,tip percentage,tax percentage consecutively");
		mealPrice=Double.parseDouble(br.readLine());
		tipPercent=Integer.parseInt(br.readLine());
		taxPercent=Integer.parseInt(br.readLine());
		tipval=mealPrice*tipPercent/100;
		taxval=mealPrice*taxPercent/100;
		total=mealPrice+tipval+taxval;
		System.out.println("The final cost is:"+total);
		
	}

}
