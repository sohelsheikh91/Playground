import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    String sec = sc.nextLine();
    for(int i =0 ; i< sec.length(); i++){
    	for (int j=0 ; j< sb.length(); j++){
        	if(sec.charAt(i)==sb.charAt(j)){
        	sb.deleteCharAt(j);
            j--;
        	}
        }
    }
    System.out.println(sb);
  }
}