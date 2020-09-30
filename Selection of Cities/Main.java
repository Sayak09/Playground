import java.util.*;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int n=0;
    int x=1;
    for(int i=0;i<t;i++)
    {
       n=sc.nextInt();
      while(n>0)
      {x=x*2;
       n--;
      }
      System.out.println(x-1);
      x=1;
    }
  }
}