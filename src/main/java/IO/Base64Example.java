package IO;
import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Кодирование байтовых данных в Base64
        byte[] data = "Hello, World!".getBytes();
        byte[] encodedBytes = Base64.getEncoder().encode(data);
        String encodedString = Base64.getEncoder().encodeToString(data);
        System.out.println("Encoded bytes: " + new String(encodedBytes));
        System.out.println("Encoded string: " + encodedString);

        // Декодирование Base64-представления
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}
