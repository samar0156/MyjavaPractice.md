import java.util.Scanner; 
 public class RemoveSpace
 {
   public static void main(String[] args)
 {
  char ch =' ' ;
  StringBuilder rem = new StringBuilder();
  System.out.println(" Enter  a string ");
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  for(int i=0; i<str.length();i++)
 {
   if(str.charAt(i)==ch)
     continue;
   else 
    rem.append(str.charAt(i));
    }
  System.out.println(rem.toString());
  
  sc.close();
 } 
 }
