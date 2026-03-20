public abstract class Member {

    //instance variables 
    private int memberID;
    private String name;
    private String email;
    private int borrowedBooks;



    public Member(int memberID, String name, String email, int borrowedBooks) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
        
        
    }

    public int getMemberId() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public void incrementBorrowedBooks() {
            borrowedBooks++;
        }

        public void decrementBorrowedBooks() {
            if (borrowedBooks > 0) borrowedBooks--;
        }

        public abstract int calculateBorrowLimit();


        public boolean canBorrow() {
            return borrowedBooks < calculateBorrowLimit();
        }
    
    
    

    @Override
    public String toString() {
        // toString implementation
        return "Member id: " + memberID +
                "\nName: " + name + "\nEmail: " + email
                + "\nBorrowed Books: " + borrowedBooks;
    }
}
