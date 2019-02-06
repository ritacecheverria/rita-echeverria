package Topic0.Point2;
//Ex 2
//MySql case
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql extends Conect {

  private static Connection con = null;

  public void ConectDb() {
    try {
      if (con == null) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://";
        String pass = "contraseña";
        String usr = "usuario";
        Class.forName(driver);
        con = DriverManager.getConnection(url, usr, pass);
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }

  }
}
