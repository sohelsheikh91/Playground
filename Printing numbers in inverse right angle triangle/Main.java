import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
     	 int n = in.nextInt();
      int val= n;
      int a=n;
	   for(int row_no = 1 ; row_no <= n ; row_no++){
			for(int c = n; c>=row_no;c--){
              System.out.print(val);
           val--;
            }
         val=--a;
         
          System.out.println();
	}
	}
}