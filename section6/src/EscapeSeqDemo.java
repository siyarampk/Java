public class EscapeSeqDemo {
    static void main(String[] args) {
        String name = "\"Siyaram\"";
        System.out.println(name);

        String m = "\u004D";
        System.out.println(m);
        String unicodeName = "Siyara\u004D "+"\u0021";
        System.out.println(unicodeName);
    }
}
