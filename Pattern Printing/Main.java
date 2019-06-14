import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in =  new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int count =n1;
      for(int i = n1 ; i> 0; i-- ){
      	for (int j = 0; j < n2; j++){
        if(i>=count)	
          System.out.print(count);
          else{
            System.out.print(count);
            count--;
          }
         
        }
         count = n1;
         System.out.println();
      }
      
    }
}