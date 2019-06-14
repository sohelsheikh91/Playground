import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    
  	String sub = scan.nextLine();
    
 	
    sb.append(sb);
    
    Boolean ans = true ;
  	int len = sub.length();
    for(int i = 0 ; i< sb.length()/2;i++){
    
    if(sb.substring(i,(len)+i).equals(sub)){
     ans = true;
     
      break;
    }
      else 
      ans = false;
    }
    if(ans==true)
      System.out.println("Yes");
    else
      System.out.println("No");
  }}