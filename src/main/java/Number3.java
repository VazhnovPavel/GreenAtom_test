public class Number3 {
    public static void main(String[] args) {
        String word1 = "Топот";
        String word2 = "Облако";

        System.out.println("Слово " + word1 + " это палиндром? " + isPalindrome(word1));
        System.out.println("Слово " + word2 + " это палиндром? " + isPalindrome(word2));
    }

    public static String isPalindrome(String word) {
        // Убираем учет регистра
        word = word.toLowerCase();
        // Берем самую левую и самую правую букву
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            // Если буквы разные – это не палиндром
            if (word.charAt(left) != word.charAt(right)) {
                return "нет";
            }
            left++;
            right--;
        }
        return "да";
    }
}
