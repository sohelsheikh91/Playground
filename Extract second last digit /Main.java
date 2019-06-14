import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      
      int c= (a/10)%10;
      System.out.println(c);
	}
}