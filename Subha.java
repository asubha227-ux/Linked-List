import javax.swing.JOptionPane;

public class SimpleHostel {
    public static void main(String[] args) {
        // Data arrays to keep the code incredibly simple
        String[] students = {"Alice (Room: 101, Fees: Paid)", "Bob (Room: 102, Fees: Pending)"};
        String[] rooms = {"Room 101: [1/2 Occupied]", "Room 102: [1/3 Occupied]"};

        while (true) {
            // Display main menu dialog box
            String menu = "--- HOSTEL MANAGEMENT SYSTEM ---\n\n" +
                          "1. View All Students\n" +
                          "2. View All Rooms\n" +
                          "3. Exit\n\n" +
                          "Enter your choice (1-3):";
            
            String choice = JOptionPane.showInputDialog(null, menu, "Hostel Menu", JOptionPane.QUESTION_MESSAGE);

            // If user clicks cancel or closes the dialog box
            if (choice == null || choice.equals("3")) {
                JOptionPane.showMessageDialog(null, "Exiting System. Goodbye!");
                break;
            }

            // Handle options
            if (choice.equals("1")) {
                String studentList = "--- REGISTERED STUDENTS ---\n" + String.join("\n", students);
                JOptionPane.showMessageDialog(null, studentList, "Student Directory", JOptionPane.INFORMATION_MESSAGE);
            } 
            else if (choice.equals("2")) {
                String roomList = "--- ROOM AVAILABILITY ---\n" + String.join("\n", rooms);
                JOptionPane.showMessageDialog(null, roomList, "Room Status", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(null, "Invalid choice! Please enter 1, 2, or 3.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
