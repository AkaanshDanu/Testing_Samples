import java.io.*;
public class SpiralArr 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int m,n;
         int temp,sr,sc;
         sr=0;
         sc=0;
         System.out.println("Enter the no. of rows amd columns!");
         m=Integer.parseInt(br.readLine());
         n=Integer.parseInt(br.readLine());
         int[][] arr=new int[m][n];
         System.out.println("Enter elements in the array");
         for(int i=0;i<m;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 arr[i][j]=Integer.parseInt(br.readLine());
        	 }
         }
         while(sr<m && sc<n)
         {
        	 for(temp=sc;temp<n;++temp)
        	 {
        		 System.out.print(arr[sr][temp]+" ");
        	 }
        	 sr++;
        	 for(temp=sr;temp<m;temp++)
        	 {
        		 System.out.print(arr[temp][n-1]+" ");
        	 }
        	 n--;
        	 if ( sr < m)
             {
                 for (temp=n-1;temp>=sc;--temp)
                 {
                     System.out.print(arr[m-1][temp]+" ");
                 }
                 m--;
             }
        	 if (sc < n)
             {
                 for (temp=m-1;temp>=sr;--temp)
                 {
                     System.out.print(arr[temp][sc]+" ");
                 }
                 sc++;    
             }        
         }
	}

}