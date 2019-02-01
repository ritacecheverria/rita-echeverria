package Topic0;

import java.sql.*;
import java.lang.*;
import java.lang.String;
import java.lang.Integer;

//Ex 2

public abstract class AbsFactory {

  String type = "tipo";
  String driver = "com.mysql.jdbc.Driver";
  String url = "jdbc:mysql://";
  String pass = "contraseña";
  String usr = "usuario";

  //Connect according Db Type
  public String getConection(String type, String driver, String url, String pass, String usr) {
    String option = type;
    if (option == "Oracle") {
      Oracle oracled = new Oracle();
      oracled.ConectDb();
    } else if (option == "Postgre") {
      Postgre postgred = new Postgre();
      postgred.ConectDb();
    } else if (option == "MySql") {
      MySql mysqld = new MySql();
      mysqld.ConectDb();
    } else {
      System.out.println("No existe esa conexion");
    }
    return null;
  }
}
