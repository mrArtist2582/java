
class MathUtils {

    private MathUtils() {
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

}

public class static_utility_class {

    public static void main(String[] args) {
        System.out.println("sum : " + MathUtils.add(5, 8));
        System.out.println("mul : " + MathUtils.multiply(5, 8));

    }
}
