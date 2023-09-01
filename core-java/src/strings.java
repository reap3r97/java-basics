public class strings {
    public static void main(String[] args) {
        // String is an object
        String statement = "I am regoing through java basics";
        String statement2 = new String("I am welcome to rego through it");

        System.out.println(statement);
        System.out.println(statement2);

        // Splitting string on whitespace
        String[] splitStatement = statement.split(" ");
        for (String value : splitStatement) {
            System.out.println(value);
        }

        String[] splitStatement2 = statement2.split("welcome");
        for (String value : splitStatement2) {
            // Trim removes white space
            System.out.println(value.trim());
        }

        // Printing string in reverse order
        for (int i = statement.length() - 1; i >= 0; i--) {
            System.out.println(statement.charAt(i));
        }
    }
}