import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        int n1 = in.nextInt();

    int mat1[][]= new int[n][n1];
   
    for(int i= 0; i<mat1.length;i++ ){
    	for(int j= 0; j< mat1[i].length;j++){
          mat1[i][j]=in.nextInt();
 	 
        }
    }
     
       for(int i= 0; i<n1;i++ ){
    	for(int j= 0; j< n;j++){
 	  	     System.out.print(mat1[j][i]+" ");     
        }  
         System.out.println();
    }
   }
}