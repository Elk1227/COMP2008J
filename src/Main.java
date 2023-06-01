import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings =new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.remove("d");
        for (String string : strings) {
            System.out.println(string);

        }

    }
}
