package com.mycompany.memberlibrary; //package

//staff class extends Member
public class StaffMember extends Member {//start class

    //max books is 10
    private int maxBooks = 10;

    //constructor
    public StaffMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
        // constructor implementation
    }

    //borrow limit
    @Override
    public int calculateBorrowLimit() {
        return maxBooks;
    }

    //sets max books
    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

    //staff information
    @Override
    public String toString() {
        // toString implementation
        return null;
    }
}//end class
