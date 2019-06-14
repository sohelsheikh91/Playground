import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
      	int n = in.nextInt();
  		 int val =0;
      for(int count= 1;count<=n;count++)
      {
          val = val+count;
      }
      System.out.println(val);
	}
}