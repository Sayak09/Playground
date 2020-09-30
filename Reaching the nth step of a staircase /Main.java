import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int z=count(0,n);
    System.out.println(z);
    
  }
  
  static int count(int start,int n1)
  {
    if(start==n1)
      return 1;
    if(start>n1)
      return 0;
    return count(start+1,n1)+count(start+2,n1);
  }
}