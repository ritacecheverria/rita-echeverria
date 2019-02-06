package Topic0.Point1;
//Singleton Db Connection Ex 1

import java.sql.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//Singleton Lazy Instantiation
public class SingletonConection {

  private static SingletonConection conn;
  private static String driver;
  private static String url;
  private static Logger logger = Logger.getLogger ("");


  //private constructor
  private SingletonConection() {
    try {
      Class.forName (driver);
      conn = (SingletonConection) DriverManager.getConnection (url);
    } catch (ClassNotFoundException | SQLException e) {
      logger.log (Level.INFO, "Connection Failed");
    }
  }

  //method getConn creation
  public static SingletonConection getConn() {
    if (conn == null) {
      conn = new SingletonConection ();
    }
    return conn;
  }
}
