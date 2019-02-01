import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton Db Connection Ex 1

public class SnDbConect {

  private static Connection conn = null;

  public static Connection getConnection() { //method getConnection creation
    try {
      if (conn == null) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://";
        String pass = "contraseña";
        String usr = "usuario";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usr, pass);
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }
}
