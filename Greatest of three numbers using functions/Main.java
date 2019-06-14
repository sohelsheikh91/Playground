import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
   int n2 = in.nextInt();
  int n3 = in.nextInt();
  int c= Great(n1,n2);
  int grt = Great(c,n3);
  System.out.println(grt);
}
  public static int Great(int n1,int n2){
   
  if (n1>n2)
    return n1;
    else
      return n2;
 	
  }
  }
