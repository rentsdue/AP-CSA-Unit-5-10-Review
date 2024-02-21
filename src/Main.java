public class Main {
    public static void main(String[] args) {

        Musician pitbull= new Musician();
        String name= pitbull.getName();
        int age= pitbull.getAge();

        Performer max= new Performer("MaximilianMus", 80);
        System.out.println(name + " " + age);
        max.perform();
        pitbull.perform();
    }
}
