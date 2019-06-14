import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
       Scanner in = new Scanner(System.in);
        String str = in.next();
    	System.out.println("Is "+str+" a valid user name? " +Pattern.matches("[a-zA-Z0-9_-]*",str));
      str = in.next();	
    System.out.println("Is "+str+" a valid email address? " +Pattern.matches("[a-z0-9@_.]*",str));
       	str = in.next();	
    System.out.println("Is "+str+" a valid password? " +Pattern.matches("[a-zA-Z0-9@#$%]*",str));
         
    }   
}