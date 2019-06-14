import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      LinkedList ar =new LinkedList();
      String str = bf.readLine();
      String[] sd = str.split(",",4);
      ar.add(sd[0]);
	  ar.add(sd[1]);
      ar.add(sd[2]);
      ar.add(sd[3]);
      String next = bf.readLine();
      System.out.println(ar);
      System.out.println("Size of the linked list: "+ar.size());
      System.out.println("Is LinkedList empty? "+ar.isEmpty());
      System.out.println("Does LinkedList contains "+next+"?");
      System.out.println(ar.contains(next));
      
    }
}