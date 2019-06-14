import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     String str = in.nextLine();
     String str1 = in.nextLine();
     int no = in.nextInt();
     str =  str1;
      String [] sd = str.split(" ",no);
      for(int i= 0; i< no ;i++)
        System.out.println(sd[i]);
    }
}