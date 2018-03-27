import java.io.*;
public class Sorting 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size,temp;
		System.out.println("Enter the size of the array");
        size=Integer.parseInt(br.readLine());
        int[] arr= new int[size];
        System.out.println("Enter values in array");
        for(int i=0;i<size;i++)
        {
        	arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size-i-1;j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<size;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        
	}

}
