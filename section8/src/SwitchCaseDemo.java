public class SwitchCaseDemo {
    public static void main(String[] args) {
        String fruitName = "Banana";

        switch (fruitName) {
            case "Banana", "Apple" -> System.out.println("$ 1.0 Charged");
            case "Grapes" -> System.out.println("$ 2.0 Charged");
            case "Pineapple" -> System.out.println("$ 2.5 Charged");
            case "Mango" -> System.out.println("$ 3.0 Charged");
            default -> System.out.println("Pik a valid fruit");

        }

        String output = switch (fruitName) {
            case "Banana", "Apple" -> "$ 1.0 Charged";
            case "Grapes" -> "$ 2.0 Charged";
            case "Pineapple" -> "$ 2.5 Charged";
            case "Mango" -> "$ 3.0 Charged";
            default -> "Pik a valid fruit";
        };

        String day = "Monday";

        int numOfLetter = switch (day) {
            case "Monday", "Sunday", "Friday" -> {
                System.out.println(6);
                yield 6;
            }
            case "Tuesday" -> {
                System.out.println(7);
                yield 7;
            }
            case "Thursday", "Saturday" -> {
                System.out.println(8);
                yield 8;
            }
            case "Wednesday" -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                System.out.println("Invalid day");
                yield 0;
            }
        };
    }
}

