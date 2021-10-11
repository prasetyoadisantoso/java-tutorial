package App.Lesson.Classes.Helper;

public class Vehicle {
    protected String brand = "Ford";
    private String otherbrand = "Mercedez";
    public void run(){
        System.out.println("Vroom, vroom");
    }

    public String getOtherbrand(){
        return this.otherbrand;
    }
}
