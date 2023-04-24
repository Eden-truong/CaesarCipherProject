package CaesarCipher;

public class CaesarCipher {
    private int key;

    public CaesarCipher(int key) {
        this.key = key;
    }

    public String encrypt(String message) {
        Encryptor encrypt = new Encryptor(key);
        return encrypt.encrypt(message);
    }

    public String decrypt(String message) {
        Decryptor decrypt = new Decryptor(key);
        return decrypt.decrypt(message);
    }
}
