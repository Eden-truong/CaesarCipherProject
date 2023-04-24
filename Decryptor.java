package CaesarCipher;

public class Decryptor {
    private int key;

    public Decryptor(int key) {
        this.key = key;
    }

    public String decrypt (String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c; //char after translation
            c = (char) (message.charAt(i) - key);
            if (c > 'z') {
                result.append((char) (message.charAt(i) + (26 - key)));
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
