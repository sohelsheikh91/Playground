import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner (System.in);
      String str = in.nextLine();
      StringBuilder st = new StringBuilder(str);
      int[] arr = new int[26];
       for(int i = 0 ; i< str.length(); i++){
        if(st.charAt(i)>='A' && st.charAt(i)<='Z'){ 
      	int val = st.charAt(i) - 'A';
        
         arr[val] = arr[val] + 1;
        }else if(st.charAt(i)>='a' && st.charAt(i)<='z'){ 
         int val = st.charAt(i) - 'a';
         arr[val] = arr[val] + 1;
        
        }
        }
       for(int i = 0 ; i<arr.length; i++){
       if(arr[i]==0){
       char che = (char)('a' + i);
       System.out.print(che+" ");
       }
       
       }
      
    }
}