import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    while(x!=0)
    {
    int n=sc.nextInt();
    System.out.println((n*(n-1))/2);
      x--;
    }
  }
}