public class Performer {
    
    protected String name;
    protected int age;

    public Performer() {
        name = "Nathaniel Higgers";
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

    public String sayNWord() {
        if (age < 18) {
            return "Nate Higgers";
        } else {
            return null;
        }
    }

    public void perform() {
        System.out.println("Hello World!");
    }

    
}
