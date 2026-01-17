import java.util.Scanner;
 public class FrequencyOfCharInString
{
  public static void main(String[] args)
 {
   String str;
  int totaleter=0;
 System.out.println(" Enter a String");
  Scanner sc = new Scanner(System.in);
  str = sc.nextLine(); 
  StringBuilder notDuplct= new StringBuilder();
  for( int i=0; i<str.length(); i++)
  {
   if(str.charAt(i)==' ')
   {continue;}
    boolean isFirst= true;
   for(int j=0; j<i; j++)
    {
     if(str.charAt(i)==str.charAt(j))
      {
        isFirst =false;
        break;
       }
    }
   if(isFirst)
   notDuplct.append(str.charAt(i));
  }
 String freshStr = notDuplct.toString();
 //System.out.println(freshStr); ke chek karne ke line likha gya tha
for(int i=0; i<freshStr.length(); i++)
 {  int frequency=0;
   for( int j=0; j<str.length(); j++)
    {    
      if(freshStr.charAt(i)==str.charAt(j))  
       frequency++;
    }
   totaleter=totaleter+frequency;
  System.out.println(freshStr.charAt(i)+" in string "+frequency+" time come");
  }
  System.out.println("total letter in String are "+totaleter);
  sc .close();
 }
}