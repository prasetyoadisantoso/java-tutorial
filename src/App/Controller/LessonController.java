package App.Controller;

import App.Lesson.Classes.MainClasses;
import App.Lesson.Method.MainMethod;
import App.Route;

public class LessonController {

    // Method
    public static void MethodLesson() {
        System.out.println("|--- Get Method Lesson ---|");
        MainMethod.main(null);
        System.out.println("\n\n");
        Route.GetRoute();
    }

    // Classes
    public static void ClassesLesson() {
        System.out.println("|--- Get Class Lesson ---|");
        MainClasses.main(null);
        System.out.println("\n\n");
        Route.GetRoute();
    }

}
