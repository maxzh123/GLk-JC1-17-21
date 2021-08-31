package SampleSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Sample {
    static final String DATABASE_URL = "jdbc:mysql://194.195.241.62/grigorovich_v_v_db";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    static final String USER = "grigorovich_v_v";
    static final String PASSWORD = ":Fcm.l)T";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        createDataBase();
    }

    public static void createDataBase() throws ClassNotFoundException, SQLException {
        try (Connection connection=DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             Statement statement=connection.createStatement()) {

            String SQL = "CREATE TABLE UserNames (Id INT PRIMARY KEY AUTO_INCREMENT, FirstName VARCHAR(20) not NULL, LastName VARCHAR(20) not NULL, Password VARCHAR(20) not NULL)";

            statement.executeUpdate(SQL);
//           for (int i = 0; i < 100; i++) {
//               String firstName = String.valueOf(SampleSql.FirstName.getNames());
//               String lastName = String.valueOf(LastName.getNames());
               statement.executeUpdate("INSERT UserNames(FirstName, LastName, Password) VALUES ('Мария', 'Кац', 'yfui')," +
                       "('Петр', 'Якименко', 'gydae'), ('Николай', 'Штых', 'jgyd')");
//           }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
