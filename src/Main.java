import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        boolean manual = args.length == 0;
        Scanner scanner = new Scanner(System.in);
        CommandLineInputs cli = manual ? new CommandLineInputs(scanner, System.out) : new CommandLineInputs(args);

        if (manual) System.out.println("Введите текст");
        Cryptor cryptor = CryptorFactory.getCryptor(cli.getAlgId(), cli.getKey());
        Function<String, String> changeString = cli.getMode().getMethod(cryptor);

        while (scanner.hasNext())
            System.out.println(changeString.apply(scanner.nextLine()));
    }

}