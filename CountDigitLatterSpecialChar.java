import java.util.Scanner;

public class CountDigitLatterSpecialChar {
  public static void main(String[] args) {
    int countDigit = 0, countLatter = 0, countSpecialChar = 0;
    System.out.println("  Enter a String ");
    String str;
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
    str = str.toUpperCase();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch>='A' && ch <= 'Z')
        countLatter++;
      else if (ch >= '0' && ch <= '9')
        countDigit++;
      else if(ch==' ')
      continue;
      else
        countSpecialChar++;
    }
    sc.close();
    System.out.println(" in String digit are :" + countDigit);
    System.out.println("  in String latter are :" + countLatter);
    System.out.println(" in String Special char: " + countSpecialChar);
  }
}