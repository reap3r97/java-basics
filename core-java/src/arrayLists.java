import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Ham");
        arrList.add("Abc");
        arrList.add("Xyz");
        System.out.println(arrList.get(1));
        arrList.remove(2);

        // iterating through array list
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        // iterating through array list using advanced for loop
        for (String value : arrList) {
            System.out.println(value);
        }

        // To check if array list contains the value
        System.out.println(arrList.contains("Ham"));

        // To convert array to array list
        String[] names = { "Babu", "Rao", "Filum" };
        List<String> nameArrayList = Arrays.asList(names);
        System.out.println(nameArrayList.contains("Babu"));
    }
}