import java.util.Scanner;
public class RightRotate
{
 public void rightRotate()
 {
   
 
 int[] arr = new int[4];
System.out.println("   Enter the array element ");
Scanner sc = new Scanner(System.in);
for(int i=0; i<arr.length; i++)
 arr[i]= sc.nextInt();
System.out.print("[");
for(int i:arr)
System.out.print(i+" ");
System.out.print("]");
System.out.println();
//*******************main logic 
  int rem=arr[arr.length-1];

    for(int i=arr.length-1; i>=0;i--)
     {
      if(i==0)
       arr[i]=rem;
      else 
        arr[i]=arr[i-1];
    }
  //***********************
   for(int x=0;x<arr.length;x++)// is cod k0  n time rotation ka code likhna baki hai samar yad rahe 
   System.out.print(arr[x]+" ");
 }


public static void main(String[] args)
  {
    RightRotate re = new RightRotate();
    re.rightRotate();
   } 
}