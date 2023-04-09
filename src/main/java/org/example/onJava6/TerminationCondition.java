package org.example.onJava6;

import onjava.Nap;

public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();
        new Nap(1);
    }
}
class Book{
    boolean checkedOut = false;
    Book(boolean checkOut) {
        this.checkedOut = checkOut;
    }
    void checkIn() {
        this.checkedOut = false;
    }

    @SuppressWarnings({"deprecation"})
    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");

        }
    }
}
