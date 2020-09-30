import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int n=1;
    int x=0;
    int a=0;
    int count=0;
    for(int i=0;i<t;i++)
    {
      count=0;
      n=sc.nextInt(); 
      a=n&(n-1);
      
      if(a==0)
        System.out.println(1);
      else{
      while(n>0)   
      {//System.out.println(n);
        if(n%2==0)
          n=n/2;
        else
        {
          n--;
          count++;
          //System.out.println(n);
          //System.out.println(count);
        }
        //System.out.println(n);
      }
        System.out.println(count);
      }
    }
  }
}