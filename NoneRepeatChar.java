public class NoneRepeatChar
{
  public void noneRepeatChar()
  {
    String str;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println(" Enter String ");
    str = sc.nextLine();
    str=str.toLowerCase();
    str=str.replace(" ","");
    for(int i=0; i<str.length();i++)

    {
      boolean isSingle =true;
      for(int j=0; j<str.length();j++)
       {//str=samar
         if(i==j)continue;
         if(str.charAt(i)==str.charAt(j)){    
         isSingle = false; break; }
      }
        
       if(isSingle)
       System.out.print(""+str.charAt(i));
    
     }
      System.out.println(" these are non repeating chars:");
   sc.close();
  }

 public static void main(String[] args)
  {
        NoneRepeatChar nrc = new NoneRepeatChar();
        nrc.noneRepeatChar();
   }
}
