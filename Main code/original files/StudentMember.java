// StudentMember.java
public class StudentMember extends Member {

    private int maxBooks = 5;

    public StudentMember(int memberID, String name, String email) {
        super(memberID, name, email);
        // constructor implementation
    }

    public int getMaxBooks() {
        // getter implementation
        return 0;
    }

    public void setMaxBooks(int maxBooks) {
        // setter implementation
    }

    @Override
    public String toString() {
        // toString implementation
        return null;
    }
}
