import java.util.Scanner;
public class RemoveDuplicate
{
 public void removeDuplicate()
 {
  int[] arr =new int[10];
  int newSize=0;
   System.out.println("Enter 10 array  element");
 Scanner sc = new Scanner(System.in);
 for(int i=0; i<arr.length; i++)
 arr[i] = sc.nextInt();
//************
 System.out.print(" Array =");
System.out.print("[");
 for(int i=0; i<arr.length; i++)
 System.out.print(arr[i]+" ");
System.out.print("]");
System.out.println();
//*****************
 for(int i=0; i<arr.length; i++)
{ boolean isDuplicate=false;
 for(int j=0; j<newSize; j++)
 {
   if(arr[i]==arr[j])
   { isDuplicate = true; break;}

 }
if(!isDuplicate){
arr[newSize]=arr[i];newSize++;}
}System.out.print("freshArray = [");
 for(int i=0; i<newSize;i++)
 System.out.print(" "+arr[i]);
System.out.print(" ]");
 }
public static void main(String[] args)
 {
 RemoveDuplicate re = new RemoveDuplicate();
 re.removeDuplicate();

}

}