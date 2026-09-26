public class BreakStatementDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        int[] arrayOutInt = {43, 455, 4376, 343, 6};
        int lookingFor = 455;
        boolean isFound = false;

        for (int i = 0; i < arrayOutInt.length; i++) {
            if (arrayOutInt[i] == lookingFor) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Number is found.");
        } else {
            System.out.println("Opps! Number is not found.");
        }

        outerFoorLoop:
        for (int i = 1; i < 5; i++) {
            innerForLoop:
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + i + " and j= " + j);
                if(j==3){
                    break  outerFoorLoop;
                }
            }
        }
    }
}
