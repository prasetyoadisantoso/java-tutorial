package App.Lesson.Method;

public class Variable {
    public static void main(String[] args) {
        displayInteger();
        displayString();
    }

    static String myString() {
        String myFirstString = "JK Rowling";
        return myFirstString;
    }

    static int myInteger() {
        int myFirstInteger = 2000;
        return myFirstInteger;
    }

    public static int displayInteger() {
        return myInteger();
    }

    public static String displayString() {
        return myString();
    }
}
