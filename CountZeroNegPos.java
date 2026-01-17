import java.util.Scanner;

public class CountZeroNegPos {
    public void checkNumberNature() {
        int positiveCount = 0, negativeCount = 0;
        int zeroCount = 0;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Array elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Array elements are =[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("]");
        System.out.println();
        // ************************logic of cod */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positiveCount++;
            else if (arr[i] < 0)
                negativeCount++;
            else
                zeroCount++;
        }
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
        sc.close();
    }

    public static void main(String[] args) {
        CountZeroNegPos nn = new CountZeroNegPos();
        nn.checkNumberNature();
    }
}
