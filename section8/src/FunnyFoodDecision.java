public class FunnyFoodDecision {
    public static void main(String[] args) {

        System.out.println(funnyFoodDecision(true, true, true));
    }

    public static String funnyFoodDecision(boolean isHungry, boolean hasPizza,
                                           boolean hasBurger) {
        // Write your logic below

        if (isHungry && hasPizza && hasBurger) {
            return "I'm hungry and I have both pizza and burger! Let's feast!";
        } else if (isHungry && hasPizza && !hasBurger) {
            return "I'm hungry and I have pizza! Let's enjoy some slices!";
        } else if (isHungry && !hasPizza && hasBurger) {
            return "I'm hungry and I have a burger! Let's munch on it!";
        } else if (!isHungry) {
            return "I'm not hungry. Let's wait for the next mealtime!";
        }
        return "";
    }
}
