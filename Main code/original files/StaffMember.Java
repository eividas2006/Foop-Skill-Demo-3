// StaffMember.java
public class StaffMember extends Member {

    private int maxBooks = 10;

    public StaffMember(int memberID, String name, String email) {
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
