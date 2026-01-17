import java.util.Scanner;
public class FirsOccurence
{
  public void fisrstOccurence()
 {
   int[] arr = new int[6];
  Scanner sc =new Scanner(System.in);
  System.out.println(" Enter the Array element");
  for(int i=0; i<arr.length;i++)
  arr[i]= sc.nextInt();
  System.out.print("  my arr = ");
  for(int i=0; i<arr.length;i++)
  System.out.print(arr[i]+" ");
  System.out.println();
 //***************************************
 for(int i=0; i<arr.length; i++)
 {   boolean isFirst =true;
     for(int j=0; j<i;j++)
     {
       if(arr[i]==arr[j])
        {
         isFirst=false;
          break;
         }
     }
     if(isFirst)
     System.out.println(" the first occurence of "+arr[i]+" at index "+i);
   }
 sc.close();
 }
public static void main(String[] args)
 {
  FirsOccurence  fi = new FirsOccurence();
  fi.fisrstOccurence();
  }
}