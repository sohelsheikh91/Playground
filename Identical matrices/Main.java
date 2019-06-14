import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] mat = new int[row][col];
    int[][] mat1 = new int[row][col];// number of row is one
    for(int c= 0; c< col; c++)
    {
      for(int r=0; r < row; r++)
      {
      	mat[c][r]=sc.nextInt();
      }
    }
     for(int c= 0; c< col; c++)
    {
      for(int r=0; r < row; r++)
      {
      	mat1[c][r]=sc.nextInt();
      }
    }
    Boolean match = true ;
    for(int c= 0; c< col; c++)
    {
      for(int r=0; r < row; r++)
      {
      	if(mat[c][r]!=mat1[c][r])
          match= false;
      }
    }
    if(match==true)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}