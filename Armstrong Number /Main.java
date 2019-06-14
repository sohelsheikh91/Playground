import java.util.Scanner;

class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
	int num= 0;
  int count =0;
 int n1 = n;
  int n2 =n;
  while(n1!=0){
	n1=n1/10;
    count++;
  }
  int c=1;
  while(n!=0){
 	 int a = n%10;
   	for(int i = 0; i<count ; i++){
    c = c*a;
   }
  num = num + c;
    c = 1;
  n = n/10;
  }
   
  if(num==n2){
 System.out.println("Armstrong Number");
  }else{
    System.out.println("Not a Armstrong Number");
  }
}
}