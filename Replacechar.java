import java.util.Scanner;
public class Replacechar
{
  public static void main(String[] args)
 {
   StringBuilder correct = new StringBuilder();
   System.out.println(" Enter wrong String");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   System.out.println(" Enter the char replaced  ");
    char goChar = sc.next().charAt(0);
   System.out.println(" Enter new char to replace with ");
    char comeChar=sc.next().charAt(0);
   for( int i=0 ; i<str.length();i++)
 {
    if(str.charAt(i)!=goChar)
    correct.append(str.charAt(i)); 
   else
    correct.append(comeChar);
  }
System.out.println(" correct string "+correct.toString());
 }
}