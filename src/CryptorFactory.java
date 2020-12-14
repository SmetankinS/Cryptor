public class CryptorFactory {
    public Cryptor getCryptor (String cryptorId) {
        return new MyCryptor();
    }
}
