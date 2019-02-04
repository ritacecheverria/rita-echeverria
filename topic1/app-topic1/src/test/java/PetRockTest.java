import static org.junit.Assert.*;

import org.junit.Test;

public class PetRockTest {

  @Test
  public void getName() {
    PetRock rock = new PetRock ("Rocky");
    assertEquals ("Rocky", rock.getName ());
  }
}