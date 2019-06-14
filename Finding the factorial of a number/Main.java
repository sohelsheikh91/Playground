import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   	  Scanner in = new Scanner(System.in);
	  int base = in.nextInt();
	  System.out.print(power(base));
  }
  public static int power(int n){
    if(n==1)
    {
    return 1;
    }
    else
    {
		return n* power(n-1);
    }
  }
}