import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in =  new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
    	int val =1;
      while(n2!=0){
    	val = val * n1;
      n2 --;
    }
      System.out.println(val);
    }
}