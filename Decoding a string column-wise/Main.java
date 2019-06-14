import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
   Scanner in= new Scanner(System.in);
   String str = in.nextLine();
   int col_count = in.nextInt();
   StringBuilder sb = new StringBuilder(str);
   int row =0,count= 0;
   int row_count = str.length()/col_count;
    int y  = 0;
    while(y!=sb.length()){
    if(sb.charAt(y)==' '){
    sb.deleteCharAt(y);

    }
      y++;
    }
   if(str.length()%col_count>0){
   row_count++;
   }
  
	while(row_count*col_count !=sb.length()){
    sb.append("X");
    }
    
    
    for(int col = 0; col<col_count; col ++){
    	for( row=0; row<row_count;row++){
    		int curr_idx = col +(row*col_count);
              if(row%2==1){
				int curr = (col_count-1)+(row*col_count);
               curr_idx = curr-col;
              }
          
          	if(curr_idx<sb.length()){
              
               System.out.print(sb.charAt(curr_idx));
            }
        }
    }
   
  }
}