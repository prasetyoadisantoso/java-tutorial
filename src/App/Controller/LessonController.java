package App.Controller;

import App.Lesson.Overloading;

public class LessonController {

    public LessonController() {

    }

    public static void VariableLesson() {
        System.out.println("Get Variable Lesson");
    }

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

}
