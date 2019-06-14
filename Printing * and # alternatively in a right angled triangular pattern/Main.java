import java.util.Scanner;
class Main
{
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
  int count=1;
		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <= cur_row ; cur_col++) {
				if(count%2==1)
              System.out.print("*");
              else System.out.print("#");
              count++;
			}
		System.out.print("\n");
		}
	}
}