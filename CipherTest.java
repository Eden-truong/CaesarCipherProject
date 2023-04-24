package CaesarCipher;
import java.util.Scanner;

public class CipherTest {
    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);

        //prompts e or d
        System.out.println("Do you want to encrypt or decrypt");
        String method = conIn.nextLine().toLowerCase();

        //prompts message
        System.out.println("What is the message?");
        String message = conIn.nextLine();

        //prompts the key
        System.out.println("please provide a key (1-26)");
        int key = conIn.nextInt();

        CaesarCipher cipher = new CaesarCipher(key);
        String result;

        //encryption / decryption invoke
        if (method.equals("encrypt")) {
            result = cipher.encrypt(message);
        }
        else if(method.equals("decrypt")) {
            result = cipher.decrypt(message);
        }
        else {
            System.out.println("Invalid Choice, Please Try Again");
            return;
        }

        //result
        System.out.println("your message encrypted is:" + result);
    }
}
