import java.util.Scanner;
 public class MergeTwoArray{
 public void  mergeTwoArray(){
 int[] arr1 = new int[5];
 int[] arr2 = new int[5];
 int[] newArr = new int[arr1.length+arr2.length];
 System.out.println("Enter 5, array 1 element");
 Scanner sc = new Scanner(System.in);
 for(int i=0; i<arr1.length; i++)
 arr1[i] = sc.nextInt();
//************
 System.out.println("Enter 5, array 2 element");
 for(int i=0; i<arr2.length; i++)
 arr2[i] = sc.nextInt();
//**********************
 System.out.print("array1 = ");
 System.out.print("[");
 for(int i=0; i<arr1.length; i++)
 System.out.print(arr1[i]+" ");
 System.out.print("]");
 System.out.println();
//*****************
System.out.print("array2 = ");
 System.out.print("[");
 for(int i=0; i<arr2.length; i++)
 System.out.print(arr2[i]+" ");
 System.out.print("]");
//***************************
int a =0;
for(int i=0; i<newArr.length; i++)
{
if(i<arr1.length)
   newArr[i] = arr1[i];
else{ 
 newArr[i]=arr2[a];
a++;}
}

System.out.println();
System.out.print("newArray = ");
 System.out.print("[");
 for(int i=0; i<newArr.length; i++)
 System.out.print(newArr[i]+" ");
 System.out.print("]");

}

 public static void main(String[] args)
 {
    MergeTwoArray me = new MergeTwoArray();
    me.mergeTwoArray();

}

}
