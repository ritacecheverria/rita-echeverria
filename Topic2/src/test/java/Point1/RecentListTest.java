package Point1;

import Point1.RecentList;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecentListTest {

  @Test
  public void emptyRecentList() {
    RecentList fileList = new RecentList();
    assertTrue (RecentList.getFileList().isEmpty());
  }
}
