class Library extends Institution {

    private int numberOfBooks;

    public Library(
        String name,
        String location,
        int capacity,
        int numberOfBooks
    ) {
        super(name, location, capacity);
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public void describeActivity() {
        System.out.println(
            "Library provides access to books and other resources."
        );
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Books: " + numberOfBooks);
    }
}
