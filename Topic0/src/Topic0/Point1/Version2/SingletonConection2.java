package Topic0.Point1.Version2;
import Topic0.Point1.SingletonConection;
import java.lang.*;

public class SingletonConection2 {
  //create an object of SingletonConection class
  private static SingletonConection2 conn = new SingletonConection2 ();
  private static String driver;
  private static String url;

  //private constructor
  private SingletonConection2() {
  }

  //method getConn creation
  public static SingletonConection2 getConn() {
    if (conn==null){
      conn = new SingletonConection2 ();
    }
    return conn;
  }


  public static String getDriver() {
    return driver;
  }

  public static String getUrl() {
    return url;
  }

  public static void setDriver(String driver) {
    SingletonConection2.driver = driver;
  }

  public static void setUrl(String url) {
    SingletonConection2.url = url;
  }
}
