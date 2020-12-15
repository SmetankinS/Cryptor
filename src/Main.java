import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean manual = args.length == 0;
        Scanner scanner = new Scanner(System.in);
        CommandLineInputs cli = manual ? new CommandLineInputs(scanner, System.out) : new CommandLineInputs(args);

        if (manual) System.out.println("Введите текст");
        Cryptor cryptor = CryptorFactory.getCryptor(cli.getAlgId(), cli.getKey());
        String coded = cli.getMode().getMethod(cryptor)
                .apply(scanner.next());

        System.out.println(coded);
    }

}