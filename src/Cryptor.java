public interface Cryptor {
    public String encrypt(String str, int key);
    public String decrypt(String str, int key);
}