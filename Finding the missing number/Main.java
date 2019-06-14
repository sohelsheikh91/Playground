import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
   	Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i< n; i++){
    arr[i] = in.nextInt();
    }
     Boolean match = false;
      for(int i= 1; i<=n; i++ ){
      for(int j = 0; j< n;j++){  
      if(i==arr[j]){
      match=true;
      }
      }
       if(match==false)
       System.out.println(i);
       match =false;
      }
    }
}