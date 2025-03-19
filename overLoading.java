//Method Overloading
//Method Overloading → Same method name, different parameters.
class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters (same name, different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class overLoading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum 1: " + obj.add(5, 10));
        System.out.println("Sum 2: " + obj.add(5, 10, 15));
    }
}
