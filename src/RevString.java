import java.io.*;
public class RevString 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str,newstr;
		newstr="";
		int len,left,right;
		char ch,temp;
		System.out.println("Enter the string!");
		str=br.readLine();
		len=str.length();
		char arr1[]=new char[len];
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			arr1[i]=ch;
		}
		left=0;
		right=len-1;
		while(left<right)
		{
			if((arr1[left]>32 && arr1[left]<48) || (arr1[left]>57 && arr1[left]<65) || (arr1[left]>90 && arr1[left]<97) || (arr1[left]>122 && arr1[left]<127)) 
	            left++;
	        else if ((arr1[right]>32 && arr1[right]<48) || (arr1[right]>57 && arr1[right]<65) || (arr1[right]>90 && arr1[right]<97) || (arr1[right]>122 && arr1[right]<127))
	            right--;
	        else
	        {
	            temp=arr1[left];
	            arr1[left]=arr1[right];
	            arr1[right]=temp;
	            left++;
	            right--;
	        }
		}
		for(int i=0;i<len;i++)
		{
			newstr=newstr+arr1[i];
		}
		System.out.println(newstr);

	}

}
