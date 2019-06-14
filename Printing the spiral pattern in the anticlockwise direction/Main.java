import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in= new Scanner(System.in);
      int n =in.nextInt();
      int min_row  = 0, min_col = 0;
      int max_row = n-1, max_col = n-1;
      int field[][] = new int[n][n];
      int count = 1; 
      while(min_row<=max_row && min_col<=max_col)
      {
      	for(int i = min_row; i <=min_row;i++){
        	for(int j = max_col; j >= min_col; j--){
            field[i][j] = count;
                           

              count ++;
            }
        }
        for(int i = min_row+1; i <=(max_row) ; i++){
        
            field[i][min_col] = count;
             
            count++;
         
        }
        for(int i = max_row; i <=max_row;i++){
        	for(int j = min_col+1; j <= max_col; j++){
            field[i][j] = count;
              count ++;
            }
        }
         for(int i = max_row-1; i >=min_row+1 ; i--){
        	for(int j = max_col; j <= max_col; j++){
            field[i][j] = count;
              count++;
            }
        }
        min_row++; max_row--; min_col++; max_col--;
      }
      for(int i = 0; i <=n-1;i++){
        	for(int j = 0; j <=n-1; j++){
            System.out.print(field[i][j]+" ");
              
            }
        System.out.println();
   	 }
    }
}