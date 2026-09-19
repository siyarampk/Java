public class AirthmaticMain{

   public  static void main(String[] args) {
        int result = AirthmeticOperations.addition(20,4);
        System.out.println(result);
        System.out.println(AirthmeticOperations.PI_VALUE);
        AirthmeticOperations airthmeticOperations = new AirthmeticOperations();
        int resultFromInstaceMethod = airthmeticOperations.sum(20,5);
        System.out.println(resultFromInstaceMethod);
    }
}
