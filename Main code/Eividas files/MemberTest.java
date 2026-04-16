
package com.mycompany.memberlibrary; //package



//member test class
public class MemberTest {//start main class
    public static void main(String[] args) {
        //print test title
        System.out.println("=== Member Class Tests ===");

        // -------------------- TEST STUDENT MEMBER --------------------
        //Create a student member 101, "Alice", alice@example.com
        
        //int memberID, String name, String email, int borrowedBooks
        //creates student member
       Member student = new StudentMember(101, "Alice", "alice@example.com", 0);
        
        
        //shows student member
        System.out.println("\nCreated Student Member:");
        System.out.println(student);

        // Test getters Name, Email, Borrowed Books, Borrow Limit

        //tests getter methods
        System.out.println("\nTesting getter");
        System.out.println("Member ID: " + student.getMemberId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Borrowed Books: " + student.getBorrowedBooks());
        
        

        // Test setters setName Alice Smith, email alice.smith@example.com
        //updates student details using setter methods
        student.setName("Alice Smith");
        student.setEmail("alice.smith@example.com");
        
        //displays updated student details
        System.out.println("Updated Student Member:");
        System.out.println(student);

        // Test borrow books increment/decrement
        //simulates borrowing books
        System.out.println("\nSimulate borrowing 3 books...");
        student.incrementBorrowedBooks();

        //displays borrowed book count
        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 3

        //simulates returning books
        System.out.println("Simulate returning 2 books...");
        student.decrementBorrowedBooks();

        //displays updated borrowed book count
        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 1

        // -------------------- TEST STAFF MEMBER --------------------
        //Create a staff member 201, "Bob", bob@example.com

        //creates a staff member
        Member staff = new StaffMember(201, "Bob", "bob@example.com", 0);

        // Test getters

        //tests staff getter methods
        System.out.println("\nTesting getter");
        System.out.println("Member ID: " + staff.getMemberId());
        System.out.println("Name: " + staff.getName());
        System.out.println("Email: " + staff.getEmail());
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks());


        // Test setters

        //updates staff details using setters
        staff.setName("Bob OBrien");
        staff.setEmail("bob.obrien@example.com");


        // Test borrow books increment/decrement

        //simulates borrowing books
        System.out.println("\nSimulate borrowing 5 books...");
        for (int i = 0; i < 5; i++) staff.incrementBorrowedBooks();
        
        //displays borrowed book count
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks()); // 5

        //simulates returning books
        System.out.println("Simulate returning 3 books...");

        //end of tests
        System.out.println("\n=== Member Tests Completed ===");
    }//end class
}//end main class
