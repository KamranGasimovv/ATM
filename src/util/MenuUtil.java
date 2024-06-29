package util;

public class MenuUtil {
    public static int entry(){
        System.out.println(
                "\n[1] -> Cashing out" +
                        "\n[2] -> Exit");
        return InputUtil.getInstance().inputTypeByte("Choose the option: ");
        
    }
}
