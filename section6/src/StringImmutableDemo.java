public class StringImmutableDemo {

    static void main(String[] args) {
        String s1 = "Hello";
        s1 = "Hello World";
        System.out.printf(s1);

        final String s2 = "Hi";
    }
}
