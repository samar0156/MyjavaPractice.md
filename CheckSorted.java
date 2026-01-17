import java.util.Scanner;
public class CheckSorted
{
 public void checkSorted(){
  int[] arr = new int[4];
  Scanner sc =new Scanner(System.in);
  System.out.println(" Enter the Array element");
  for(int i=0; i<arr.length;i++)
  arr[i]= sc.nextInt();
  System.out.print("  my arr = ");
  for(int i=0; i<arr.length;i++)
  System.out.print(arr[i]+" ");
//*********************************
boolean istrue=true;
  for(int i=0;i<arr.length-1;i++){
  if(arr[i]>arr[i+1]){
   istrue=false;
  break;}
 }
 if(istrue)
   System.out.print("  Array is sorted");
 else
   System.out.print(" array is Not sorted"); 
 sc.close();
}
public static void main(String[] args)
 { 
  CheckSorted ch = new CheckSorted();
   ch.checkSorted();
  }
}