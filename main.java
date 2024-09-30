public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe("Coffee Corner", "Downtown", 50, 10);
        cafe.displayInfo();
        cafe.describeActivity();

        Store store = new Store(
            "Electronics World",
            "Mall",
            100,
            "Electronics"
        );
        store.displayInfo();
        store.describeActivity();

        Library library = new Library(
            "City Library",
            "City Center",
            500,
            100000
        );
        library.displayInfo();
        library.describeActivity();

        System.out.println(
            "Total Institutions: " + Institution.getInstitutionCount()
        );
    }
}
