import java.util.Scanner;
public class ReverseString {
 public static void main(String[] args)
  {

    String str ;
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A string  :  ");
    str =sc.nextLine();
    for(int i=str.length()-1; i>=0; i--)
    sb.append(str.charAt(i));
    System.out.println(sb.toString());
    sc.close();
    
  }
}
