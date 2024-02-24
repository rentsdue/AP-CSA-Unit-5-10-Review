import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Unit 9: Inheritance tests
        //Creating object classes and an arraylist of performers
        Musician pitbull= new Musician();
        Performer max= new Performer("MaximilianMus", 80);
        Performer powell= new Dancer(); //This shows that a parent class object can be created with a child class constructor (the reverse can't happen)
        Rapper kanye= new Rapper();
        ArrayList<Performer> performerList= new ArrayList<Performer>(); //Arraylist of performers
        performerList.add(pitbull);
        performerList.add(max);
        performerList.add(powell);
        performerList.add(kanye);

        //Creating variables
        String nameP= pitbull.getName();
        int ageP= pitbull.getAge();

        //Testing methods
        System.out.println(nameP + " " + ageP);
        max.perform(); //Demonstrates polymorphism 
        pitbull.perform();
        powell.perform();
        kanye.perform();
    }
}
