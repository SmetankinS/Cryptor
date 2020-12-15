import java.io.PrintStream;
import java.util.Scanner;

public class CommandLineInputs {
    private CryptorMode mode = CryptorMode.ENCRYPT;
    private String key = "";
    private String algId="default";

    public CommandLineInputs(String[] args) {
        for (int i = 0; i < args.length; i++)
            switch (args[i]) {
                case "key":
                    key = args[++i];
                    break;
                case "mode":
                    mode = CryptorMode.valueOfCanonical(args[++i]);
                    break;
                case "alg":
                    algId = args[++i];
                    break;
                default:
                    throw new CliException("unknown parameter " + args[i]);
            }
    }


    public CommandLineInputs(Scanner scanner, PrintStream out) {
        out.print("Choose action (encrypt/decrypt)? ");
        mode = CryptorMode.valueOfCanonical(scanner.nextLine());

        out.print("Choose algorithm (\"" + algId + "\" by default)? ");
        String tmp = scanner.nextLine();
        if (!tmp.isEmpty()) algId = tmp;

        out.print("Setup encryption key (any string)? ");
        key = scanner.nextLine();
    }

    public static class CliException extends RuntimeException {
        public CliException(String message) {super(message);}
    };

    public String getAlgId() { return algId; }
    public CryptorMode getMode() { return mode; }
    public String getKey() { return key; }
}
