
package com.mycompany.memberlibrary;

// StudentMember.java
public class StudentMember extends Member {

    private int maxBooks = 5;

    public StudentMember(int memberID, String name, String email, int borrowedBooks) {
        super(memberID, name, email, borrowedBooks);
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
        return super.toString()
        + "Max Books: " + maxBooks;
    }
}