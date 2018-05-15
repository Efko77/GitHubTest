package second;

public class FirstTask {

    private static final String PALINDROME_1 = "Kol einu sunie lok"; //sukuriamos konstantos rasosi klases
    private static final String PALINDROME_2 = "Argi ten ne tigra";
    private static final String PALINDROME_3 = "Sdek uzu kedes";

    public static void main(String[] args) {
        String[] palindroMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3}; //sukuriamas masyvas
        for (String p : palindroMas) {
            /* boolean isPalindrome = isWordIsPalindrome("Kol einu sunie lok".replaceAll(" ", " "));*/
            if (isWordIsPalindrome(p.replaceAll(" ", ""))) {
                System.out.println("Polindromas");


            } else {
                System.out.println("Nepolindromas");
            }

        }

        private static boolean isWordIsPalindrome (String word){
            boolean isPalindrome = true;
            for (int i = 0; i < word.length(); i++) {
                char a = word.charAt(i);
                int t = word.length() - 1 - i;
                char b = word.charAt(t);

                if (a != b) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        }
    }
}




