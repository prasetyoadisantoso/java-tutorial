package App.Lesson.Classes.Helper;

public class AccessClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
