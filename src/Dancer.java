import java.util.ArrayList;

public class Dancer extends Performer {

    private String title;
    ArrayList<String> danceMoves= new ArrayList<String>();

    public Dancer() {
        super();
    }
    
    public Dancer(String name, int age) {
        super(name, age); //Super keyword needed since name/age are private
    }

    public Dancer(String name, int age, String title) {
        super(name, age);
        this.title=title;
    }

    public void perform() {
        super.perform(); //Polymorphism example
        System.out.println("I dance a lot");
    }
}
