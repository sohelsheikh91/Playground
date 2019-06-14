import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
      String str = in.nextLine();
      StringBuilder st = new StringBuilder(str);
    
      int[] arr = new int[26];
      
      for(int j =0 ; j<st.length();j++){
       	if(st.charAt(j)>='A' && st.charAt(j)<='Z'){
         	int val = st.charAt(j) -'A';
          	char ch =(char) ('a'+val);
          	st.setCharAt(j,ch);
          	arr[val] = arr[val]+1;
        }else if(st.charAt(j)>='a' && st.charAt(j)<='z'){
       		int val = st.charAt(j)-'a';
         	arr[val] = arr[val]+1;
        	}
       	}
        for(int j =0 ; j<st.length();j++){
          int val = st.charAt(j)-'a';
          if(arr[val]!=0){
            System.out.print(st.charAt(j)+""+arr[val]+" ");
          arr[val]=0;}
          }
       	}
           
      }