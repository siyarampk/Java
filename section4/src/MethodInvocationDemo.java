public class MethodInvocationDemo {

    public static void main(String[] args) {
        MethodInvocationDemo methodInvocationDemo = new MethodInvocationDemo();
        methodInvocationDemo.method1();
    }

    public void method1() {
        int number = 10;
        System.out.println("Method1");
        String output = method2();
        System.out.println(output);
    }

    public String method2() {
        String output = "Hello World";
        System.out.println("Method2");
        method3("Hi");
        return output;
    }

    public void method3(String input) {
        System.out.println(input);
        System.out.println("Method3");
        method4(10);
    }

    public void method4(int num) {
        System.out.println(num);
        System.out.println("Method4");
    }
}
