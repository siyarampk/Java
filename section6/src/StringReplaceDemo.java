public class StringReplaceDemo {
    static void main(String[] args) {
        String originalString = "Hello, World!";
        String replacedString = originalString.replace('o','*');
        String replacedString1 = originalString.replace("world","Universe");
        String replacedString2 = originalString.replace("World","Universe");

        String originalString1 = "abababab";
        String replacedString3 = originalString1.replace("ab","X");

        String originalString2 = "Java is fun!";
        String replacedString4 = originalString2.replaceAll("a|e|i|o|u","*");

        String origanlString3 ="apple orange apple, banana, apple";
        String replacedString5 = origanlString3.replaceFirst("apple","grapes");



    }
}
