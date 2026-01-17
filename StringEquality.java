import java.util.Scanner;
 public class StringEquality
 {
 public static void main(String[] args) 
 {
   String str1;
   String str2 = new String();
   Scanner sc = new Scanner(System.in);
   System.out.println(" Enter str1 :");
   str1 = sc.nextLine();
   System.out.println(" Enter str2 :");
   str2 =sc.nextLine();
   boolean check1 , check2,check3;
   check1 = (str1==str2);
    check2 = (str1.equals(str2));
 check3= (str1.equalsIgnoreCase(str2));
   System.out.println(check1);
   System.out.println(check2);
   System.out.println(check3);
   sc . close();
}}