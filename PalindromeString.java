import java.util.Scanner;

public class PalindromeString {
   public static void main(String[] args) {
      String str;
      Scanner sc = new Scanner(System.in);
      System.out.println("  Enter a String");
      str = sc.nextLine();
      str = str.toUpperCase();
      // **************************
      StringBuilder clean = new StringBuilder();
      for (int i = 0; i < str.length(); i++)
         if (str.charAt(i) != ' ')
            clean.append(str.charAt(i));
      // *************************
      String str2 = clean.toString();
      StringBuilder reverse= new StringBuilder();
      // chek karne ke liya likha tha System.out.println(str2);
      for (int i = str2.length() - 1; i >= 0; i--)
         reverse.append(str2.charAt(i));
      if (str2.equals(reverse.toString()))
         System.out.println("  String is palindrome");
      else
         System.out.println("  String is Not palindrome");
      sc.close();
   }
}