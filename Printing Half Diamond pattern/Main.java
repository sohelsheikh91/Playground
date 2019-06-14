import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	   for(int row_no = 1 ; row_no <= n ; row_no++){
			for(int c = 1; c<=(n-row_no);c++)
              System.out.print(" ");
          for(int c = 1; c<=(2*row_no-1);c++)
              System.out.print("*");
          System.out.println();
	}
	}
}