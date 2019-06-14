import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] mat = new int[row][col]; // number of row is one
    for(int c= 0; c< col; c++)
    {
      for(int r=0; r < row; r++)
      {
      	mat[c][r]=sc.nextInt();
      }
    }
    for(int r= row-1; r>=0; r--)
        {
          for(int c=0; c <col; c++)
          {
            System.out.print(mat[c][r]+" ");
          }
      System.out.println();
    	}
  }
}