public class methods {
    public static void main(String[] args) {
        utils util = new utils();
        String name;

        util.getData();
        name = util.getName();
        System.out.println(name);

        getData();
    }

    // When it is static then no need to declare object to access the methods
    public static void getData() {
        System.out.println("hello");
    }
}