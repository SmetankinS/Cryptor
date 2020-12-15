public class CryptorFactory {
    public static Cryptor getCryptor(String cryptorId, String key) {
        switch (cryptorId) {
            case ScitalCryptor.name:
            case "default":
                return new ScitalCryptor(Integer.valueOf(key));
            default:
                throw new CryptorFactoryException("Unknown cryptor name: " + cryptorId);
        }

    }

    public static class CryptorFactoryException extends RuntimeException {
        public CryptorFactoryException(String message) { super(message); }
    }
}
