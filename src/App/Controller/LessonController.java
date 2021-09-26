package App.Controller;

import App.Lesson.Overloading;
import App.Lesson.Recursion;
import App.Route;

public class LessonController {

    public LessonController() {

    }

    // Variable
    public static void VariableLesson() {
        System.out.println("Get Variable Lesson");
    }

    // Overloading
    public static void OverloadingLesson() {
        System.out.println("Get Overloading Lesson");
        System.out.println("|--------------------|");

        // Additional Integer
        Overloading intOvload = new Overloading();
        System.out.println(intOvload.generalAddition(10, 10));

        // Additional String
        Overloading strOvload = new Overloading();
        System.out.println(strOvload.generalAddition("Hello, ", "World!"));
    }

    // Recursion
    public static void RecursionLesson() {
        System.out.println("Get Recursion Lesson");
        System.out.println("|--------------------|");
        Recursion rec = new Recursion();
        System.out.println("Summary: " + rec.sumResult());
        System.out.println("Factorial: " + rec.facResult());
        Route.GetRoute();
    }

}
