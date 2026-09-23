public class TextBlockDemo {

    static void main(String[] args) {
        String input = "Hello, My name is Siyaram\n" +
                "I am 30 years old\n";
        System.out.printf(input);

        String htmlCode = "<html>\n" +
                "<boyd>\n" +
                "<p>Hello World></p>\n" +
                "<body>\n" +
                "<html>\n";
        System.out.printf(htmlCode);

        String textBlock = """
                <html>
                    <boyd>
                        <p>Hello World></p>
                    <body>
                <html>
                """;
        System.out.printf(textBlock);

    }
}
