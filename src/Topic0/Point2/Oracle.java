package Topic0.Point2;
//Ex 2
//Oracle case

import java.sql.*;
import java.lang.*;

class Oracle extends Conect {

  public void ConectDb() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      try (Connection con = DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle")) {
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }
}