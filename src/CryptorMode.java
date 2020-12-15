import java.util.function.Function;

public enum CryptorMode {
    ENCRYPT(x -> {return x::encrypt;}),
    DECRYPT(x-> {return x::decrypt;});

    private Function<Cryptor, Function<String, String>> refGetter;

    CryptorMode(Function<Cryptor, Function<String, String>> refGetter) {
        this.refGetter = refGetter;
    }

    public static CryptorMode valueOfCanonical(String name) {
        return valueOf(name.toUpperCase());
    }

    public Function<String, String> getMethod(Cryptor cryptor) { return refGetter.apply(cryptor); }
}
