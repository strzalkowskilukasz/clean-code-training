package pl.training.refactoring.old;


public class Test {

    public static void main(String[] args) {
        Customer c = new Customer("Kowalski");
        c.addRental(new Rental(new Movie("some movie", 0), 5));
        c.addRental(new Rental(new Movie("some movie 2", 1), 15));
        c.addRental(new Rental(new Movie("some movie 3", 2), 7));
        System.out.println(c.statement());
    }

}
