import java.util.Scanner;

public class CountWord {
  public static void main(String[] args) {
    int word = 0;
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("  Enter a string");
    str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch != ' ' && (i == str.length() - 1 || str.charAt(i + 1) == ' '))
        word++;
    }
    System.out.println(" Number of words in the string: " + word);
    sc.close();
  }
}
