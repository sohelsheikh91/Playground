import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner in= new Scanner(System.in);
      int n= in.nextInt();
     	int val = n%10;
      while(n>9){
      n=n/10;
        
      }
      n= n+val;
      System.out.println(n);

	}
}