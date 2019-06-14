import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    
      public static void main(String a[])throws IOException
    {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      ArrayList ar =new ArrayList();
       while(true){
           
            System.out.println("Choose any one:");
            System.out.println("1.Insert");
            System.out.println("2.delete");
            System.out.println("3.Display");
         	System.out.println("4.Exit");
        String check= bf.readLine();
         if(check.equals("1")){
         
            String str = bf.readLine();
            String[] sd = str.split(",");
           for(int i= 0; i< sd.length;i++){
              ar.add(sd[i]);
           }
          
         }else if(check.equals("2")){
         System.out.print("Enter the index value to be deleted:");
           
           int temp = Integer.parseInt(bf.readLine());
           System.out.println(temp);
           ar.remove(temp);
         }else if(check.equals("3")){
         System.out.println(ar);
         }else if(check.equals("4")){
           break;
         }
           
       
       }
        
    
      
    }
    
}