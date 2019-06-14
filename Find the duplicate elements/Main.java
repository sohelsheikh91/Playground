import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     ArrayList ar = new ArrayList();
      
      
            String str = bf.readLine();
            String[] sd = str.split(",");
           	for(int i= 0; i< sd.length;i++){
              ar.add(sd[i]);
           }
      Set tr =new TreeSet();
      System.out.println("Duplicate Entry is:");
      
     
      
		
      for(int i= 0; i< ar.size();i++){
        if(!(tr.add(ar.get(i))))
              System.out.println(ar.get(i));
           }
      System.out.println("TreeSet is : "+tr);
    }
}