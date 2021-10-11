package App.Lesson.Method;

import Package.InputManagement;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("=> Overloading Method = 'overloading' ");
        System.out.println("=> Recursion Method = 'recursion' ");
        String input = InputManagement.StandardInput();

        switch (input){
            case "overloading":
                Overloading.main(null);
                break;
            case "recursion":
                Recursion.main(null);
                break;
            default:
                MainMethod.main(null);
                break;
        }
    }
}
