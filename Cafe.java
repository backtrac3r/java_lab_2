class Cafe extends Institution {

    private int numberOfTables;

    public Cafe(
        String name,
        String location,
        int capacity,
        int numberOfTables
    ) {
        super(name, location, capacity);
        this.numberOfTables = numberOfTables;
    }

    @Override
    public void describeActivity() {
        System.out.println("Cafe serves food and drinks to customers.");
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Tables: " + numberOfTables);
    }
}
