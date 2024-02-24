public class Rapper extends Musician {

    private int drive;
    private boolean isPerforming=false;
    
    public Rapper() {
        super();
        super.setName("Grad Lin");
        concerts=0; //Protected variables can be accessed by subclasses
    }

    public Rapper(String name, int age, String instrument, int concerts, int drive) {
        super(name, age, concerts, instrument);
        this.drive=drive;
        this.isPerforming=true;
    }

    public int getDrive() {
        return this.drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public boolean isPerforming() {
        return this.isPerforming;
    }

    public void setPerforming(boolean isPerforming) {
        this.isPerforming = isPerforming;
    }

    public void setConcerts(int concerts) { //Polymorphism example 2
        super.setConcerts(concerts);
        System.out.println("The number of concerts is " + concerts);
    }
}
