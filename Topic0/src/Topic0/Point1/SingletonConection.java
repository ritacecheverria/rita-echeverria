package Topic0.Point1;
//Singleton Db Connection Ex 1

import java.sql.*;
import java.lang.*;

public class SingletonConection {

  private static SingletonConection conn;
  private static String driver;
  private static String url;


  //private constructor
  private SingletonConection() {
    try{
      Class.forName(driver);
      conn = (SingletonConection) DriverManager.getConnection (url);
    }
    catch(ClassNotFoundException | SQLException e){
     }
  }

  //method getConn creation
  public static SingletonConection getConn() {
    if (conn == null) {
      conn = new SingletonConection();
    }
    return conn;
  }
}
