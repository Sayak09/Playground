import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int len=0;
    int start=0,end=0,count=0;
    for(int i=0;i<n;i++)
    {
      len=sc.nextInt();
      int[] arr=new int[len];
      for(int j=0;j<len;j++)
        arr[j]=sc.nextInt();
      end=arr.length-1;
      count=0;
      start=0;
      
      while(start<=end)
      {
        if(arr[start]==arr[end])
        {
          start++;
          end--;
        }
        else if(arr[start]>arr[end])
        {
          arr[end-1]=arr[end]+arr[end-1];
          count++;
          end--;
        }
        else{
        	arr[start+1]=arr[start]+arr[start+1];
          count++;
          start++;
        }
      }
      
      System.out.println(count);
      
      
    }
    
  }
}