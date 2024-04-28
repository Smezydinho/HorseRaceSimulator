public class Horse {
    private char symbol;
    private String name;
    private double confidence;
    private int distance;
    private Boolean fallen;

    /**
     * Constructor for objects of class Horse
     * 
     * @param horseSymbol is symbol of horse
     * @param horseName is name of horse
     * @param horseConfidence is confidence of horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence) {
        // initialise instance variables
        symbol = horseSymbol;
        name = horseName;
        confidence = horseConfidence;
        distance = 0;
        fallen = false;
    }

    public void fall() {
        fallen = true;
    }

    public double getConfidence() {
        return confidence;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void goBackToStart() {
        distance = 0;
    }

    public Boolean hasFallen() {
        return fallen;
    }

    public void moveForward() {
        distance++;
    }

    public void setConfidence(double newConfidence) {
        confidence = newConfidence;
    }

    public void setSymbol(char newSymbol) {
        symbol = newSymbol;
    }
}
