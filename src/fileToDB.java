import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class fileToDB {
	public void printFileToDB() throws SQLException {
		System.out.print("Storing info from File 1...");
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("JDBC driver missing!");
			e.printStackTrace();
			return;
		}
		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
					"123456");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}connection.setAutoCommit(false);
		String csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line=br.readLine();
			Statement statement = connection.createStatement();
			while ((line = br.readLine()) != null) {
				String[] columnVal = line.split(cvsSplitBy);
				statement = connection.createStatement();
				int id=1;
				String query = "INSERT INTO f1 (ID, NAME) VALUES (" + columnVal[0] + ",'" + columnVal[1].trim() + "')";
		        statement.executeUpdate(query);
		        System.out.println(columnVal[0]+ " " + columnVal[1]);
		        statement.close();
			}
		}catch(FileNotFoundException e) {
        e.printStackTrace();
		}catch (IOException e) {
        e.printStackTrace();
		}finally {
			if (br != null) {
				try {
					br.close();
				}catch (IOException e) {
                e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
		csvFile = "C:\\Users\\navinadarsh\\Downloads\\DataSet3\\F2.csv";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line=br.readLine();
			Statement statement = connection.createStatement();
			while ((line = br.readLine()) != null) {
				String[] columnVal = line.split(cvsSplitBy);
				statement = connection.createStatement();
				int id=1;
				System.out.println("INSERT INTO f2 (ID,RESOURCE,UTIL_UNITS,START,END) VALUES (" + columnVal[0] + ",'" + columnVal[1].trim() + "'," + columnVal[2].trim() + "," + columnVal[3].trim() + "," + columnVal[4].trim() + ")");
				String query = "INSERT INTO f2 (ID,RESOURCE,UTIL_UNITS,START,END) VALUES (" + columnVal[0] + ",'" + columnVal[1].trim() + "'," + columnVal[2].trim() + "," + columnVal[3].trim() + "," + columnVal[4].trim() + ")";
		        statement.executeUpdate(query);
		        statement.close();
			}
		}catch(FileNotFoundException e) {
        e.printStackTrace();
		}catch (IOException e) {
        e.printStackTrace();
		}finally {
			if (br != null) {
				try {
					br.close();
				}catch (IOException e) {
                e.printStackTrace();
				}
			}
		}
		System.out.println("Done");
		
        connection.commit();
        connection.close();
	}
}
