package Topic0.Point3;

//Create concrete classes
public class RealConnectionDB implements ConnectionDB {
  private String database;

  public RealConnectionDB(String database) {
    this.database = database;
    }

  @Override
  public void connect() {
    System.out.println("Connection established");
  }

}
