public class MyCryptor implements Cryptor{

    @Override
    public String encrypt(String str, int key) {
        char[] symbol = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            symbol[i] = (char)((int)(str.charAt(i)) + key);
        }
        return new String(symbol);
    }

    @Override
    public String decrypt(String str, int key) {
        char[] symbol = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            symbol[i] = (char)((int)(str.charAt(i)) - key);
        }
        return new String(symbol);
    }
}
