import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long fact=0;
    long x=0;
    long c=0,d=0;
    long arr[]=new long[2];
    while(n>0){
    for(int i=0;i<2;i++)
    {
      arr[i]=sc.nextInt();
    }
    c=arr[0];
    d=arr[1];
   	while(c!=0)
    {
      c=c/d;
      x+=c;
    }
      System.out.println(x);
      x=0;
      n--;
    
  }
  }
  
}