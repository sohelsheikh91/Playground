import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       Map ar =new TreeMap();
      System.out.print("Enter the number of values to be inserted in map:");
      int n = Integer.parseInt(bf.readLine());
      System.out.println(n);
      for(int i = 0; i< n;i++)
      	ar.put(bf.readLine(),bf.readLine());
      System.out.println(ar);
      
      System.out.print("Enter the index to be removed:");
       String str = bf.readLine();
       System.out.println(str);
       ar.remove(str);
      System.out.println(ar);
      
      System.out.print("Size of map is : "+ ar.size());
     
    }
}