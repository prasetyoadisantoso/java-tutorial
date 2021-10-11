package App.Lesson.Classes;

public class ClassMethod {

    public static void main(String[] args) {
        System.out.print("Call myMethod(): "); myMethod();

        // Call static method
        myStaticMethod();

        // Call Public method
        ClassMethod main = new ClassMethod();
        main.myPublicMethod();

        // Sample Lesson for Get Speed of Car
        System.out.println("\n|--- Get Speed Car ---|");
        main.fullThrottle();
        main.speed(100);

    }

    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
