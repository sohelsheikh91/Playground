import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     String str = in.nextLine();
     StringBuilder st = new StringBuilder(str);
      
      reverse_string(st,0,st.length()-1);
      int start  = 0;
      for(int i=0; i<st.length();i++){
      
        if(st.charAt(i)==' ')
      	{
        reverse_string(st,start,i-1);
          start = i+1;
        }
        else if (st.charAt(i)==st.length()-1){
         reverse_string(st,start,i);      
          start = i+1;
        }
        
      	}
        System.out.println(st);
      
      }
      
    
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      
      int i=start_idx;
      int j = end_idx;
      char ch= 'a';
      char ch2 = 'a';
      while(i<j)
      {
       ch = sb.charAt(j);
       ch2 = sb.charAt(i);
        sb.setCharAt(i,ch);
        sb.setCharAt(j,ch2);
        i++;
        j--;
      }
      
    }
}