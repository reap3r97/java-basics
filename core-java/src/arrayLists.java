import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Ham");
        arrList.add("Abc");
        arrList.add("Xyz");
        System.out.println(arrList.get(1));
        arrList.remove(2);
    }
}