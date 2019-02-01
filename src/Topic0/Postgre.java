package Topic0;
//Ex 2
//Postgre case
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Postgre extends Conect {

  public void ConectDb() {
    try {
      Connection con = DriverManager.getConnection("jdbc:postgresql://", "postgres", "postgres");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}