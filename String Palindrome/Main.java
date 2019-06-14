import java.util.Scanner;
class Main{
    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
     String str = in.nextLine();
     StringBuilder st = new StringBuilder(str);
     int i = 0;
      int j = st.length()-1;
      Boolean val = true;
      while(i<j){
     	if(st.charAt(i)!=st.charAt(j)){
        val = false;
        }
        i++;
        j--;
     } 
      if(val==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}