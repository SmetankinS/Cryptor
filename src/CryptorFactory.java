public class CryptorFactory {
    public static Cryptor getCryptor (String cryptorId) {
        return new MyCryptor();
    }
}
