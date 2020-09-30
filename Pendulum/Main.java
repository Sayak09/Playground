import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner sc  =new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr =new int[n];
    int[] temp =new int[n];
    int max=0;
    int pos=0;
    int low=0,high=n-1;
    int cc=1;
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      
    while(low<=high)
    {
      for(int i=0;i<n;i++)
      {
        if(arr[i]>max)
        {
          max=arr[i];
          pos=i;
        }
      }
      //System.out.println(max);
      arr[pos]=-1;
      if(cc%2!=0)
      {
        temp[high]=max;
        high--;
      }
      else{
      	temp[low]=max;
        low++;
      }
      cc++;
      max=0;
    }
    
    for(int i=0;i<n;i++)
      System.out.print(temp[i]+" ");
    
  }
}