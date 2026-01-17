public class InputAndPrintString {
    public void inputAndPrintString() {
        String str;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("  Enter a String");
        str = sc.nextLine();
        int a= str.length();
        System.out.println("  My string =" + str);
        System.out.println("  Length of my String = "+a);
        sc.close();
    }

    public static void main(String[] args) {
        InputAndPrintString app = new InputAndPrintString();
        app.inputAndPrintString();
    }
}
