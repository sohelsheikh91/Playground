import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);
     String str = sc.nextLine(); 
    	int len = str.length();
    	len = len /2;
    String st = "";
    for(int i = len; i< str.length(); i++){
    st = st + str.charAt(i);
    }
    for(int i = 0; i< len; i++){
    st = st + str.charAt(i);
    }
    
    for(int i= 0; i< st.length(); i++){
    	for(int k=st.length()-1; k>i; k--){
    	System.out.print(" ");
    	}
    	for(int j=0; j<=i; j++){
    	System.out.print(st.charAt(j));
    	}
      System.out.println();
    }
  }
}