package ciphers;
public class CaesarCipher extends Cipher {

    public CaesarCipher() {}

    @Override
    public String encrypt(String plainText, int key) {

        String cipherText = "";

        for (int i=0; i<plainText.length(); i++) {

            int ascii = (int) plainText.charAt(i);

            if (ascii < 97 || ascii > 122) {
                cipherText += plainText.charAt(i);
            } else {
                ascii += key;
                if (ascii < 97) {
                    ascii = 122 - (96-ascii);
                } else if (ascii > 122) {
                    ascii = 96 + (ascii-122);
                }
                cipherText += Character.toString((char) ascii);
            }
        }
        return cipherText;
    }

    @Override
    public String decrypt(String cipherText, int key) {
        return encrypt(cipherText, -key);
    }

}