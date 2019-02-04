package Topic0.Point2;
//Ex 2
//Postgre case
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgre extends Conect {

  public void ConectDb() {
    try {
      Connection con = DriverManager.getConnection("jdbc:postgresql://", "postgres", "postgres");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}