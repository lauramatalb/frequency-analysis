import ciphers.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();

        Message test1 = new Message("hello", caesarCipher, 3);
        System.out.println(test1.getPlainText() + " --> " + test1.getCipherText());

        Message test2 = new Message("abcxyz", caesarCipher, 3);
        System.out.println(test2.getPlainText() + " --> " + test2.getCipherText());
    }
}