import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       TreeSet ar =new TreeSet();
      
            String str = bf.readLine();
            String[] sd = str.split(",");
           for(int i= 0; i< sd.length;i++){
              ar.add((sd[i]));
           }
      System.out.println(ar);
           
              while(!ar.isEmpty()){
                ar.remove(ar.last());
               
                System.out.println(ar);

              }
       
    }
}