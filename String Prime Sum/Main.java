import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=0;
    int num=2;
    int ncheck=0;
    int flag=0;
    int sum=0;
    int st=0;
    for(int i=0;i<s.length();i++)
    {
      ncheck=(int)s.charAt(i);
      if(ncheck>=48 && ncheck<=57)
      	n=n*10+Integer.parseInt(String.valueOf(s.charAt(i)));
      else
      {
        flag=1;
        break;        
      }
    }
    
    if(flag==1)
      System.out.println(0);
    
    else{
     
      while(num<n)
      {
        st=prime(num);
        if(st==1)
          sum+=num;
        
        num++;
      }
      System.out.println(sum);
    }
    
  }
  static int prime(int x)
  {
    int c=0;
    for(int i=2;i<x-1;i++)
    {
      if(x%i==0)
        c++;
      }
    if(c==0 && x!=1)
      return 1;
    else
      return 0;
    
  }
}