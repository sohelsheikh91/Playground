import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
 
    StringBuilder sb = new StringBuilder(str);
    for(int i = 0; i< sb.length();i++){
          
   		for(int j = i+1;  j<sb.length();j++){
        if(sb.charAt(i)==sb.charAt(j)){
        sb.deleteCharAt(j);
       
        i++;
          if(i!=j)
        --j;
        }
        }
  }
    System.out.println(sb);
    
  }
}