import java.util.*;
import java.io.*;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      ArrayList ar = new ArrayList();
      
      try{
            int str =Integer.parseInt( bf.readLine());
            
           	System.out.println(str);
      }
     catch(Exception e){
     	System.out.println("Input Mismatch Exception occurred");
      
     }
       
      }
}