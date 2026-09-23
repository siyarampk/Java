public class StringSearchDemo {
    static void main(String[] args) {
        String originalString = "Hello World!";
        int index = originalString.indexOf("!");
        int index1 = originalString.indexOf("World");
        int index2 = originalString.indexOf("@");

        boolean isContain = originalString.contains("World");
        boolean isPresent = originalString.contains("@");

        boolean startWith = originalString.contains("Hello");
        boolean endWith = originalString.contains("ld");

        boolean isMatched = originalString.matches(".*World*");
    }
}
