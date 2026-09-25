public class LogicalOperatorDemo {
    public static void main(String[] args) {
        boolean isValid;
        isValid = !true;
        isValid = !false;
        int num1 = 9;
        int num2 = 6;
        isValid = !(num1 > num2);

        boolean a = (num1 > 5) && ((num2 = 16)) > 15;
        System.out.println(a);


        boolean b = (num1 < 10) || ((num2 = 18) > 15);
        System.out.println(b);
        System.out.println(num2);

        boolean c = (num1>5) ^ (num2>10);
        System.out.println(c);

        boolean b1 = true;
        b1 &= true;
        System.out.println(b1);

        boolean b2= true;
        b2 |= true;
        System.out.println(b2);

    }
}
