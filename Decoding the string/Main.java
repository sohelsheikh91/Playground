import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    StringBuilder sb = new StringBuilder(str);
    for(int i = 0 ; i< sb.length() ; i++){
    if(sb.charAt(i)>='a'&& sb.charAt(i)<='z'){
    char ch =sb.charAt(i);
    	int v = ch - 'a';
      v= v-key;
      if(v<0){
      v= v+26;
      }
     char cap = (char)('a'+v);
     sb.setCharAt(i,cap);
     }
      else if(sb.charAt(i)>='A'&& sb.charAt(i)<='Z'){
       char ch =sb.charAt(i);
    	int v = ch - 'A';
      v= v-key;
      if(v<0){
      v= v+26;
      }
     char cap = (char)('A'+v);
     sb.setCharAt(i,cap);
      }
    
    }
    System.out.println(sb);
  }
}