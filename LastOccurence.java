import java.util.Scanner;

public class LastOccurence {
  public void lastOccurence() {
    int[] arr = new int[6];
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Array element");
    for (int i = 0; i < arr.length; i++)
      arr[i] = sc.nextInt();
    System.out.print("  my arr = ");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
    // ****************
    for (int i = arr.length - 1; i >= 0; i--) {
      boolean isLast = true;
      for (int j = arr.length - 1; j > i; j--) {
        if (arr[i] == arr[j]) {
          isLast = false;
          break;
        }
      }
      if (isLast)
        System.out.println("  the last occurence of " + arr[i] + " at index " + i);
    }
    sc.close();
  }

  public static void main(String[] args) {
    LastOccurence la = new LastOccurence();
    la.lastOccurence();
  }
}