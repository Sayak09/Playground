import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int a=Integer.parseInt(String.valueOf(s.charAt(0)));  
    int b=Integer.parseInt(String.valueOf(s.charAt(1)));  
    int c=Integer.parseInt(String.valueOf(s.charAt(3)));  
    int d=Integer.parseInt(String.valueOf(s.charAt(4)));  
    int hh=10*a+b;
    int mm=10*c+d;
    int req=0;
    while(mm%10 != hh/10 || mm/10!=hh%10)
    {
      ++mm;
      if(mm==60)
      {
        hh++;
        mm=0;
      }
      if(hh==24)
      	hh=0;
      req++;
    }
    System.out.println(req);
  }
}