
/* 
  method overloading :- it means in the  methods have same name but having different parameters.
                    ->  aslo known as compiletime polymorphism
                    
 */
class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class methodOverloading {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));
        System.out.println(math.add(5, 10, 15));
        System.out.println(math.add(2.5, 3.7));
    }
}
