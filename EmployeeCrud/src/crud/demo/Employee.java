package crud.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 7 Nov 2024
 * Time   : 5:11:26 pm
 * Email  : satyam.3.singh@coforge.com
 */

//Employee class to implement CRUD operations
public class Employee {

	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet res;

	public Connection getConnection()
	{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "cfg@1234");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}

	public void insertEmployee(String name, String city, String contact) 
	{
		System.out.println("**************** Insert new Employees*****************");
		try {
			con = getConnection();
			String query = "INSERT INTO employee (name, city, contact) VALUES (?, ?, ?)";
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contact);
			ps.executeUpdate();
			System.out.println("** Employee Inserted **");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void getEmployee() 
	{
		System.out.println("**************** Display Employees*****************");

		try {
			con = getConnection();
			String query = "SELECT * FROM employee";
			st = con.createStatement();
			res = st.executeQuery(query);
			System.out.println("** Display Employees **");
			while (res.next()) {
				System.out.println("ID: " + res.getInt("e_id") + ", Name: " + res.getString("name") +
						", City: " + res.getString("city") + ", Contact: " + res.getString("contact"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void updateEmployee(int id,String city) 
	{
		System.out.println("**************** Update Employees*****************");
		
		try {
            con = getConnection();
            String query = "UPDATE employee SET city = ? WHERE id = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, city);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("** Employee Updated **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}

	public void deleteEmployee(int id) 
	{
		System.out.println("**************** Delete Employees*****************");
		try {
            con = getConnection();
            String query = "DELETE FROM employee WHERE id = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("** Employee Deleted **");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

	}

	public void updateEmployeeEmail(int e_id) {
		
	}
}

