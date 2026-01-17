public class CountVowelAndCosonants {

    public void countVowelAndConsonants() {
        String str;
        int vowelsCount = 0;
        int consCount = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        String str1 = str.toUpperCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    vowelsCount++;
                else
                    consCount++;
            }
        }
        System.out.println("  In String " + vowelsCount + " vowels");
        System.out.println(" In String " + consCount + " consonants");
        sc.close();
    }

    public static void main(String[] args) {
        CountVowelAndCosonants app = new CountVowelAndCosonants();
        app.countVowelAndConsonants();
    }
}
