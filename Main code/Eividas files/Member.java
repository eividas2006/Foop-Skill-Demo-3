public abstract class Member {//start class

    //instance variables 
    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;


    //member constructor
    public Member(int memberID, String name, String email, int borrowedBooks) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
        
        
    }

    //returns the member ID
    public int getMemberId() {
        return memberID;
    }
    //sets the member ID
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    //returns the member name
    public String getName() {
        return name;
    }
    //sets the member name
    public void setName(String name) {
        this.name = name;
    }
    //returns the member email
    public String getEmail() {
        return email;
    }
    //sets the member email
    public void setEmail(String email) {
        this.email = email;
    }
    //increases borrowed books up by one
     public void incrementBorrowedBooks() {
            borrowedBooks++;
        }
        //decreases borrowed books if it's greater than zero
        public void decrementBorrowedBooks() {
            if (borrowedBooks > 0) borrowedBooks--;
        }
        //borrow limit set in subclass
        public abstract int calculateBorrowLimit();

        //checks if member can borrow more books
        public boolean canBorrow() {
            return borrowedBooks < calculateBorrowLimit();
        }
    
    
    
    //returns member details as a string
    @Override
    public String toString() {
        return "Member id: " + memberID +
                "\nName: " + name + "\nEmail: " + email
                + "\nBorrowed Books: " + borrowedBooks;
    }
}//end class
