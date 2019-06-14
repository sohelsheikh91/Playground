import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in= new Scanner(System.in);
      	int n = in.nextInt();
     int val=1;
      for(int count= 1;val<=n;count++)
      {
        if(count%2==1){
          System.out.println(count);
          count++;
          val++;
      }
	}
	}}