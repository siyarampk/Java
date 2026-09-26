public class ReturnStatementDemo {
    public static void main(String[] args) {
        String result = getStudente(90);
        System.out.println(result);

        int[] arrayOutInt = {43, 455, 4376, 343, 6};
        int lookingFor = 455;
        int index = findAndReturnNumber(arrayOutInt,lookingFor);
        System.out.println(index);
    }

    public static String getStudente(int marks) {
        String result;
        if (marks >= 40) {
            result = "Passed";
        } else {
            result = "Failed";
        }
        return result;
    }

    public static int findAndReturnNumber(int[] arrayOfNumber, int target) {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            if (arrayOfNumber[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
