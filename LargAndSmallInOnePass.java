public class LargAndSmallInOnePass {
    public void findLargestAndSmallest() {
        int[] arr = new int[10];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 10 Array elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Array elements are =[");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("]");
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);
        sc.close();
    }

    public static void main(String[] args) {
        LargAndSmallInOnePass las = new LargAndSmallInOnePass();
        las.findLargestAndSmallest();
    }
}
