public class Java7 {

    public static void main(String[] args) {
        State state1 = new State();
        Continent myContinent = Continent.EUROPE;
        state1.setNameCountry("Ukraine");
        state1.setCapital("Kiev");
        state1.setPopulation(33000000);
        state1.setSquare(603628);
        System.out.println("Country: " + state1.getNameCountry());
        System.out.println("Capital: " + state1.getCapital());
        System.out.println("Continent: " + myContinent);
        System.out.println("Population: " + state1.getPopulation());
        System.out.println("Square: " + state1.getSquare());
    }
}

class State {
    private String nameCountry;
    private String capital;
    private int population;
    private int square;

    public void setNameCountry(String nameCountry) {
        if (nameCountry.isEmpty())
            System.out.println("You entered an empty string");
        else
            this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setCapital(String capital) {
        if (capital.isEmpty())
            System.out.println("You entered an empty string");
        else
            this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setPopulation(int population) {
        if (population < 0)
            System.out.println("You entered a negative number");
        else
            this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setSquare(int square) {
        if (square < 0)
            System.out.println("You entered a negative number");
        else
            this.square = square;
    }

    public int getSquare() {
        return square;
    }
}