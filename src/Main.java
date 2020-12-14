import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String action;
        System.out.println("Выберите действие (encrypt/decrypt)");
        Scanner scanner = new Scanner(System.in);
        action = scanner.next();
        if(action.equals("encrypt")) {
            int key = 1;
            System.out.println("Введите текст");
            String str = scanner.next();
            Cryptor cryptor = CryptorFactory.getCryptor("default");
            System.out.println(cryptor.encrypt(str, key));
        } else if(action.equals("decrypt")) {
            int key = 1;
            System.out.println("Введите текст");
            String str = scanner.next();
            Cryptor cryptor = CryptorFactory.getCryptor("default");
            System.out.println(cryptor.decrypt(str, key));
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}