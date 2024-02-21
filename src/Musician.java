public class Musician extends Performer {
    
    private String instrument;
    private int concerts;
    private String[] jokes= {"What did Morbius ask his waiter for? A glass of juice!", "Why did the chicken cross the road? To escape the police!", "What is 1+1? Who cares about math?"};

    public Musician() {
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
        this.name=name;
        this.age=age;
        this.concerts=concerts;
        this.instrument=instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void perform() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }

}
