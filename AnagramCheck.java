import java.util.Scanner;
public class AnagramCheck 
{
    // is program me  hum case and space sensitive  ke liye optimised kar sakte hai.
 public static void main(String[] args)
  {
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);
       System.out.println("  Enter First String ");
      str1 =sc.nextLine();
       System.out.println(" enter second String: ");
       str2= sc.nextLine();
        char temch1=' ';
        char temch2=' ';
        char[] arr1 = str1.toCharArray();
        char[] arr2 =str2.toCharArray();
        if(str1.length()==str2.length())
        {
            for(int i=0; i<arr1.length;i++)
            {
             for(int j=i+1; j<arr2.length;j++)
             {
                 if(arr1[i]>arr1[j])
                 {
                     temch1=arr1[j];
                     arr1[j]=arr1[i];
                     arr1[i]=temch1;
                 }
                  if(arr2[i]>arr2[j])
                  {
                     temch2=arr2[j];
                     arr2[j]=arr2[i];
                     arr2[i]=temch2;
                }
             }
            }  
        String newStr1=new String(arr1);
        String newStr2 = new String(arr2);
        if(newStr1.equals(newStr2))
        {
            System.out.println(" Strings are Anagram");
        }
        else{
            System.out.println(" Strings are not Anagram:");
        }
        }
        else
        {
            System.out.println(" strings are not Anagram");
        }
  
    }
}