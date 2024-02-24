public class Performer {
    
    private String name;
    private int age;

    public Performer() {
        name = "Nathaniel Triggers";
        age = 18;
    }

    public Performer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String sayWord() {
        if (age < 18) {
            return "You are too young";
        } else {
            return null;
        }
    }

    public void perform() {
        System.out.println("Hello World!");
    }

    
}
