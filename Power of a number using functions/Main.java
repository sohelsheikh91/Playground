import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
     int n2 = in.nextInt();
 
	int a = sum(n1,n2);
  System.out.println(a);
    
 	
}
  public static int sum(int n1,int n2){
    int sum = 1;
  while(n2!=0){
sum = sum * n1;
    n2--;
  }
  return sum;
  }
}
