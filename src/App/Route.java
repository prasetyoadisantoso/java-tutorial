package App;

import Package.RouteManagement;
import App.Controller.LessonController;
import java.util.Map;
import java.util.HashMap;
import Package.InputManagement;

public class Route {

    /* Enter Route */
    public static void GetRoute() {

        //Input Route
        Map<String, Runnable> map = new HashMap<String, Runnable>();
        // Define Route and Controller
        map.put("variable", ()->LessonController.VariableLesson());
        map.put("overloading", ()->LessonController.OverloadingLesson());

        String input = InputManagement.Input();
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
