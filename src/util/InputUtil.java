package util;

import java.util.Scanner;

public class InputUtil {
    private static InputUtil instance;

    public static InputUtil getInstance() {

        if (instance == null) {
            instance = new InputUtil();
        }
        return instance;

    }
    private InputUtil() {
    }

    public Integer inputTypeInteger (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextInt();
    }

    public String inputTypeString (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLine();
    }
    public Long inputTypeLong (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextLong();
    }
    public Byte inputTypeByte (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextByte();
    }
    public Short inputTypeShort (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextShort();
    }
    public Double inputTypeDouble (String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextDouble();
    }
}
