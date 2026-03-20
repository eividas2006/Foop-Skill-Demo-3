package com.mycompany.memberlibrary;

public class StaffMember extends Member {

    private int maxBooks = 10;

    public StaffMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
        // constructor implementation
    }

    @Override
    public int calculateBorrowLimit() {
        return maxBooks;
    }


    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

    @Override
    public String toString() {
        // toString implementation
        return null;
    }
}