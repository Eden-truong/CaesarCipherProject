package CaesarCipher;

public class Encryptor {
    private int key;

    public Encryptor(int key) {
        this.key = key;
    }

    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c; //current char after key
            c = (char) (message.charAt(i) + key);
            if (c > 'z') {
                result.append((char) (message.charAt(i) - (26 - key)));
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
