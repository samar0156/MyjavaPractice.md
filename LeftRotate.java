import java.util.Scanner;

public class LeftRotate {
    public void leftRotate() {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 Array elemets:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("My Array = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        // **************************************main logic of code
        System.out.println();
        int rotationOfNum;
        while (true) {
            System.out.println();
            System.out.print("Enter number of rotation you want ** (enter 0 to terminate):");
            rotationOfNum = sc.nextInt();
            
                if (rotationOfNum == 0) {
                    System.out.println("rotation terminated ");
                    System.out.println();
                    break;
                }
                 rotationOfNum =rotationOfNum %arr.length;
                int j = 0;
                System.out.println();

                while (j < rotationOfNum) {
                    int rem = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (i == arr.length - 1)
                            arr[i] = rem;
                        else
                            arr[i] = arr[i + 1];
                    }
                    j++;
                }

                // ***********************
                System.out.println();
                System.out.print("Rotate Array = [");
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.print("]");
                System.out.println();

            
        }
        sc.close();
    }

    public static void main(String[] args) {
        LeftRotate le = new LeftRotate();
        le.leftRotate();
    }

}