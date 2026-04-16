
package com.mycompany.memberlibrary; //package

// StudentMember.java

// Student class extends Member
public class StudentMember extends Member { //start class

    //max books is 5
    private int maxBooks = 5;

    //constructor
    public StudentMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
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

    //student details
    @Override
    public String toString() {
        return super.toString()
        + "Max Books: " + maxBooks;
    }
}//end class
