import java.util.*;
import java.sql.*;

class CreateDB {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int ch, n = 0, count = 0;
        String temp;

        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("--------------------------------------------------");
                System.out.println("\t\tMENU");
                System.out.println("--------------------------------------------------");
                System.out.println(" 1} Add engine parts information ");
                System.out.println(" 2} Display engine parts information ");
                System.out.println(" 3} List information of given serial no ");
                System.out.println(" 4} List the count of engine parts in the company ");
                System.out.println(" 5} Exit");
                System.out.println("--------------------------------------------------");
                System.out.print("Enter Your Choice Number: ");
                ch = scanner.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("\nHow Many engine parts information You Want to Add: ");
                        n = scanner.nextInt();
                        System.out.println("-------------------------------------");
                        System.out.println("Add information of " + n + " parts");
                        System.out.println("--------------------------------------");
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter year of manufacturing: ");
                            int p_mfg = scanner.nextInt();
                            System.out.print("Material of engine part: ");
                            scanner.nextLine(); // Consume newline
                            String p_material = scanner.nextLine();
                            System.out.print("Enter serial number: ");
                            String p_srn = scanner.nextLine();
                            System.out.print("Enter quantity of parts: ");
                            int p_quantity = scanner.nextInt();

                            // Insert data into the database
                            preparedStatement = connection.prepareStatement("INSERT INTO parts (p_mfg, p_material, p_srn, p_quantity) VALUES (?, ?, ?, ?)");
                            preparedStatement.setInt(1, p_mfg);
                            preparedStatement.setString(2, p_material);
                            preparedStatement.setString(3, p_srn);
                            preparedStatement.setInt(4, p_quantity);
                            preparedStatement.executeUpdate();

                            System.out.println("-------------------------------------");
                            count++;
                        preparedStatement = connection.prepareStatement("SELECT * FROM parts");
                        resultSet = preparedStatement.executeQuery();
                        System.out.println("\n\t\t Information of All parts of engine");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("MFG\tMaterial\tSRN\tQuantity");
                        System.out.println("---------------------------------------------------------------");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getInt("p_mfg") + "\t" +
                                    resultSet.getString("p_material") + "\t" +
                                    resultSet.getString("p_srn") + "\t" +
                                    resultSet.getInt("p_quantity"));
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("\nEnter Serial Number: ");
                        temp = scanner.next();
                        System.out.println("--------------------------------------");
                        boolean found = false;
                        // Search data in the database
                        preparedStatement = connection.prepareStatement("SELECT * FROM parts WHERE p_srn = ?");
                        preparedStatement.setString(1, temp);
                        resultSet = preparedStatement.executeQuery();
                        while (resultSet.next()) {
                            System.out.println(resultSet.getInt("p_mfg") + "\t" +
                                    resultSet.getString("p_material") + "\t" +
                                    resultSet.getString("p_srn") + "\t" +
                                    resultSet.getInt("p_quantity"));
                            found = true;
                        }
                        if (!found) {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("\t\tData not found !!!!");
                            System.out.println("---------------------------------------------------------------");
                        }
                        break;

                    case 4:
                        // Count data in the database
                        preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS total FROM parts");
                        resultSet = preparedStatement.executeQuery();
                        resultSet.next();
                        System.out.println("\n-----------------------------------------");
                        System.out.println("Total Number of engine parts in company: " + resultSet.getInt("total"));
                        System.out.println("-----------------------------------------");
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }

            } while (ch != 5);

            // Close resources
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
