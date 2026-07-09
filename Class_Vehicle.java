import java.sql.*;
import java.util.Scanner;

public class Class_Vehicle {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/training";
        String user = "root";
        String password = "kavin1,2,3";

                Scanner sc = new Scanner(System.in);

                try {

                    Connection con = DriverManager.getConnection(url , user, password);
                    System.out.println("VEHICLE MANAGEMENT SYSTEM");


                    while (true) {

                        System.out.println("\n1. Get Vehicle By ID");
                        System.out.println("2. Get Vehicle By Company");
                        System.out.println("3. Update Vehicle");
                        System.out.println("4. Delete Vehicle");
                        System.out.println("5. Get All Vehicles");
                        System.out.println("6. Exit");

                        System.out.print("Enter your choice : ");
                        int choice = sc.nextInt();
                        sc.nextLine();

                        switch (choice) {

                            case 1:

                                System.out.print("Enter Vehicle ID : ");
                                int id = sc.nextInt();

                                String sql1 = "SELECT * FROM vehicle WHERE vehicle_id=?";

                                PreparedStatement ps1 = con.prepareStatement(sql1);
                                ps1.setInt(1, id);

                                ResultSet rs1 = ps1.executeQuery();

                                if (rs1.next()) {

                                    System.out.println("\nVehicle Details");
                                    System.out.println("-------------------------");
                                    System.out.println("Vehicle ID      : " + rs1.getInt("vehicle_id"));
                                    System.out.println("Vehicle Model   : " + rs1.getString("vehicle_model"));
                                    System.out.println("Vehicle Company : " + rs1.getString("vehicle_company"));

                                } else {

                                    System.out.println("Vehicle not found.");

                                }

                                break;

                            case 2:

                                System.out.print("Enter Company Name : ");
                                String company = sc.nextLine();

                                String sql2 = "SELECT * FROM vehicle WHERE vehicle_company=?";

                                PreparedStatement ps2 = con.prepareStatement(sql2);
                                ps2.setString(1, company);

                                ResultSet rs2 = ps2.executeQuery();

                                boolean found = false;

                                while (rs2.next()) {

                                    found = true;

                                    System.out.println("*****************");
                                    System.out.println("Vehicle ID      : " + rs2.getInt("vehicle_id"));
                                    System.out.println("Vehicle Model   : " + rs2.getString("vehicle_model"));
                                    System.out.println("Vehicle Company : " + rs2.getString("vehicle_company"));
                                }

                                if (!found) {

                                    System.out.println("No vehicles found.");

                                }

                                break;

                            case 3:

                                System.out.print("Enter Vehicle ID : ");
                                int updateId = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter New Model : ");
                                String model = sc.nextLine();

                                System.out.print("Enter New Company : ");
                                String comp = sc.nextLine();

                                String sql3 = "UPDATE vehicle SET vehicle_model=?, vehicle_company=? WHERE vehicle_id=?";

                                PreparedStatement ps3 = con.prepareStatement(sql3);

                                ps3.setString(1, model);
                                ps3.setString(2, comp);
                                ps3.setInt(3, updateId);

                                int update = ps3.executeUpdate();

                                if (update > 0) {

                                    System.out.println("Vehicle Updated Successfully.");

                                } else {

                                    System.out.println("Vehicle ID Not Found.");

                                }

                                break;

                            case 4:

                                System.out.print("Enter Vehicle ID to Delete : ");
                                int deleteId = sc.nextInt();

                                String sql4 = "DELETE FROM vehicle WHERE vehicle_id=?";

                                PreparedStatement ps4 = con.prepareStatement(sql4);

                                ps4.setInt(1, deleteId);

                                int delete = ps4.executeUpdate();

                                if (delete > 0) {

                                    System.out.println("Vehicle Deleted Successfully.");

                                } else {

                                    System.out.println("Vehicle ID Not Found.");

                                }

                                break;

                            case 5:

                                String sql5 = "SELECT * FROM vehicle";

                                PreparedStatement ps5 = con.prepareStatement(sql5);

                                ResultSet rs5 = ps5.executeQuery();

                                System.out.println("\n****************************************************");
                                System.out.printf("%-10s %-15s %-20s\n", "ID", "MODEL", "COMPANY");
                                System.out.println("********************************************************");

                                while (rs5.next()) {

                                    System.out.printf("%-10d %-15s %-20s\n",
                                            rs5.getInt("vehicle_id"),
                                            rs5.getString("vehicle_model"),
                                            rs5.getString("vehicle_company"));

                                }

                                break;

                            case 6:

                                con.close();
                                sc.close();

                                System.out.println("Thank You.");
                                return;

                            default:

                                System.out.println("Invalid Choice.");

                        }

                    }

                } catch (SQLException e) {

                    System.out.println(e.getMessage());

                }

            }

        }
