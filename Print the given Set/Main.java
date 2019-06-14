import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      Set ar =new LinkedHashSet();
      
        
            String str = bf.readLine();
            String[] sd = str.split(",");
           for(int i= 0; i< sd.length;i++){
              ar.add(sd[i]);
           }
      System.out.println(ar);
          
    }
}