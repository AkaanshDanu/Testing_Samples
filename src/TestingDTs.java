
public class TestingDTs {

	public static void main(String[] args) 
	{
		byte byt=1;
		short shrt=10;
		int integ=1000;
		long lrgint=10000000;
		float dec=12.5F;
		double lrgdec=26781.907;
		char letter='t';
		boolean val=false;
		
		if((lrgint/1000)<integ)
			System.out.println(byt);
		else
			System.out.println(shrt);
		
		if(Math.sqrt(Math.sqrt(lrgdec))<dec)
			System.out.println(letter);
		else
			System.out.println(val);

	}

}
