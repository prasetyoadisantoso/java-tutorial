package App.Lesson.Method;

import App.Route;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Get Recursion Lesson");
        System.out.println("|--------------------|");
        Recursion rec = new Recursion();
        System.out.println("Summary: " + rec.sumResult());
        System.out.println("Factorial: " + rec.facResult());
        System.out.println("\n\n");
        Route.GetRoute();
    }

    public static int sumResult() {
        int result = sum(10);
        return result;
    }

    public static int facResult() {
        int result = factorial(5);
        return result;
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int factorial(int x){
        if (x > 0){
            return x * factorial(x - 1);
        } else {
            return 1;
        }
    }
}
