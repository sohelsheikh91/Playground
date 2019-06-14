import java.util.Scanner;
class Main{
	public static void main (String[] args){
	           Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
      int a=1;
      int b =0;
      int nun =n;
      while(n!=0){
        int tuta =n%10;
      for(int i = 1;i<=tuta;i++ ){
      a = a*i;
      }
 
      b = b + a;
        a=1;
       n = n/10;
	}
     
       if(nun==b){
 System.out.println("Yes");
  }else{
    System.out.println("No");
  }
}
}