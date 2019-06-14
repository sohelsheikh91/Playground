import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String st = "aeiou";
    for (int i= 0; i<st.length(); i++){
      for(int j = 0; j<sb.length(); j++){
      if(sb.charAt(j)==st.charAt(i)){
      sb.deleteCharAt(j);
        j--;
      }
      }
    
    }
    System.out.println(sb);
  }
}