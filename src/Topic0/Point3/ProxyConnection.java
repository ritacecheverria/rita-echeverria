package Topic0.Point3;

public class ProxyConnection implements ConnectionDB {

  private RealConnectionDB realConnectionDB;
  private String database;

  public ProxyConnection(String database) {
    this.database = database;
  }

  @Override
  public void connect() {
    if (realConnectionDB == null) {
      realConnectionDB = new RealConnectionDB (this.database);
    }
    realConnectionDB.connect ();
  }

}
