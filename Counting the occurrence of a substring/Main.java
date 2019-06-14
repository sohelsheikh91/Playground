import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in = new Scanner(System.in);
     String str = in.nextLine();
     StringBuilder st = new StringBuilder(str);
     String str1 = in.nextLine();
     StringBuilder sub = new StringBuilder(str1);
  	  int count = 0;
   		
    for (int i = 0 ; i< st.length()-sub.length()+1; i++){
    	Boolean match = true ;
      for (int j=0; j< sub.length(); j++)
      {
      if(st.charAt(i+j)!=sub.charAt(j))
      {
      match = false;
      }
        
      }
      if(match== true)
        {
        count ++;
        }
     
    
    }
   System.out.println(count);
  
  } 
}