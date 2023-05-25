import ciphers.Cipher;

public class Message {

    private String plainText;
    private String cipherText;

    public Message(String text, Cipher cipher, int key) {
        this.plainText = text;
        this.cipherText = cipher.encrypt(plainText, key);
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getCipherText() {
        return this.cipherText;
    }

}