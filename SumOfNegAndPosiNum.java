import java.util.Scanner;

public class SumOfNegAndPosiNum {
    public void sumOfNegAndPosiNum() {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Array elemets:");
        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
            System.out.print("My Array 1[");
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
//**************************************
        System.out.println("]");
        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sumPositive += arr[i];
            } else {
                sumNegative += arr[i];
            }
        }
//********************************
        System.out.println("Sum of Positive Numbers: " + sumPositive);
        System.out.println("Sum of Negative Numbers: " + sumNegative);
    }
    public static void main(String[] args) {
         SumOfNegAndPosiNum sp = new SumOfNegAndPosiNum();
            sp.sumOfNegAndPosiNum();
          
    }
}