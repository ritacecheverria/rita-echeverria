package Point1;

import Point1.RecentList;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecentListTest {

  @Test
  public void openFirstTimeEmptyRecentList() {
    RecentList fileList = new RecentList();
    assertTrue (RecentList.getFileList().isEmpty());
  }

  @Test
  public void fileOpenedAddedRecentList() {
  }

  @Test
  public void existingOpenedFileTopRecentList() {
  }

  @Test
  public void oldestItemRemovedRecentList() {
  }
}
