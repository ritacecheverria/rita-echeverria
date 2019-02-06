package Topic0.Point2;

import java.lang.*;
import java.lang.String;

//Ex 2

public abstract class AbsFactoryConnector {

  String type = "tipo";
  String driver = "com.mysql.jdbc.Driver";
  String url = "jdbc:mysql://";
  String pass = "contraseña";
  String usr = "usuario";

  //Connect according Db Type
  public String getConection(String type, String driver, String url, String pass, String usr) {
    switch (type) {
      case "Oracle":
        Oracle oracled = new Oracle ();
        oracled.ConectDb ();
        break;
      case "Postgre":
        Postgre postgred = new Postgre ();
        postgred.ConectDb ();
        break;
      case "MySql":
        MySql mysqld = new MySql ();
        mysqld.ConectDb ();
        break;
      default:
        throw new IllegalArgumentException ("Unable to recognice " + type);
    }

    return null;
  }
}
