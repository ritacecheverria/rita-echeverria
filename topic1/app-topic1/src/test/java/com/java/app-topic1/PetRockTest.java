import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PetRockTest {
  @Test
  public void getName() {
    PetRock rock = new PetRock ("Rocky");
    assertEquals (rock.getName(),"Rocky");
  }
}