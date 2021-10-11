package App;

import Package.RouteManagement;
import App.Controller.LessonController;
import java.util.Map;
import java.util.HashMap;
import Package.InputManagement;
import Package.ConsoleManagement;

public class Route {

    /* Enter Route */
    public static void GetRoute() {

        //Input Route
        Map<String, Runnable> map = new HashMap<>();

        // Define Route and Controller
//        map.put("variable", ()->LessonController.VariableLesson());
        map.put("method", ()->LessonController.MethodLesson());
        map.put("classes", ()->LessonController.ClassesLesson());
        map.put("exit", ()->System.exit(0));
        map.put("clear", ()->ConsoleManagement.ClearConsole());

        String input = InputManagement.RouteInput();
        Boolean checkValue = map.containsKey(input);
        Runnable method =  map.get(input);

        // Validation the condition
        if(checkValue == true){
            RouteManagement.RunMethod(input, method);
        } else {
            GetRoute();
        }

    }




}
