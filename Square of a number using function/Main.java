import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
 	int a = sum(n1);

  System.out.println(a);
    
 	
}
  public static int sum(int n){
  return n*n;
  }
}
