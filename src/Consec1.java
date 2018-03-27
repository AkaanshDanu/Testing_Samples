import java.io.*;
public class Consec1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,k=0,l=0,copy=0,count=0,temp;
		int arr[]=new int[100];
		int arr2[]=new int[100];
		System.out.println("Enter a number");
		num=Integer.parseInt(br.readLine());
		while(num>0)
		{
			arr[k]=num%2;
			num=num/2;
			k++;
		}
        System.out.println("Binary Representation:");
        for(int i=k-1;i>=0;i--)
        {
        	System.out.print(arr[i]);
        	copy=(copy*10)+arr[i];
        }
        System.out.println("");
        for(int i=0;i<100;i++)
        {
        	if(arr[i]==0)
        	{
        		arr2[l]=count;
        		count=0;
        		l++;
        	}
        	else
        	{
        		count++;
        	}
        }
        for(int i=0;i<k;i++)
        {
        	for(int j=0;j<k-i-1;j++)
        	{
        		if(arr2[j]<arr2[j+1])
        		{
        			temp=arr2[j];
        			arr2[j]=arr2[j+1];
        			arr2[j+1]=temp;
        		}
        	}
        }
        System.out.println("Max no. of Consecutive one's are:"+arr2[0]);
        
	}

}
