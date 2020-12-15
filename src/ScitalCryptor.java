public class ScitalCryptor implements Cryptor{
    public static final String name = "scital";
    private final int key;

    public ScitalCryptor(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(String str) {
        char[] symbol = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            symbol[i] = (char)((int)(str.charAt(i)) + key);
        }
        return new String(symbol);
    }

    @Override
    public String decrypt(String str) {
        char[] symbol = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            symbol[i] = (char)((int)(str.charAt(i)) - key);
        }
        return new String(symbol);
    }

    @Override
    public String getName() { return name; }
}
