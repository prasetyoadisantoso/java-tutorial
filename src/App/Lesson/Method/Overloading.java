package App.Lesson.Method;

import App.Route;

public class Overloading {

    public static void main(String[] args) {
        // Additional Integer
        Overloading intOvload = new Overloading();
        System.out.println(intOvload.generalAddition(10, 10));

        // Additional String
        Overloading strOvload = new Overloading();
        System.out.println(strOvload.generalAddition("Hello, ", "World!"));
        System.out.println("\n\n");
        Route.GetRoute();
    }

    public String generalAddition(String a, String b){
        return a + b;
    }

    public int generalAddition(int a, int b){
        return a + b;
    }
}
