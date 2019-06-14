import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = in.nextInt();
    int mat1[][]= new int[n][n1];
    int mat2[][]= new int[n][n1];
    int mat3[][]= new int[n][n1];
    for(int i= 0; i<mat1.length;i++ ){
    	for(int j= 0; j< mat1[i].length;j++){
          mat1[i][j]=in.nextInt();
 	 
        }
    }
      for(int i= 0; i<mat2.length;i++ ){
    	for(int j= 0; j< mat2[i].length;j++){
          mat2[i][j]=in.nextInt();
 	  	          
        }
      }
       for(int i= 0; i<mat3.length;i++ ){
    	for(int j= 0; j< mat3[i].length;j++){
          mat3[i][j]=mat1[i][j]-mat2[i][j];
 	  	     System.out.print(mat3[i][j]+" ");     
        }  
         System.out.println();
    }
   }
}