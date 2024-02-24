public class Musician extends Performer {
    
    private String instrument;
    protected int concerts;
    private String[] jokes= {"What did Morbius ask his waiter for? A glass of juice!", "Why did the chicken cross the road? To escape the police!", "What is 1+1? Who cares about math?"};

    public Musician() { //Multiple constructors are made
        concerts= 69;
        instrument = "Piano";
    }

    public Musician(String instrument) {
        this.instrument=instrument;
    }

    public Musician(int concerts, String instrument) {
        super();
        this.concerts = concerts;
        this.instrument= instrument;
    }

    public Musician (String name, int age, int concerts, String instrument) {
        super(name, age); //Super keyword needed if name and age are private (no need if it's protected)
        this.concerts=concerts;
        this.instrument=instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getConcerts() {
        return this.concerts;
    }

    public void setConcerts(int concerts) {
        this.concerts = concerts;
    }

    public void perform() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }

}
