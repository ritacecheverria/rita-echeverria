package Point1;

import Point1.RecentList;

import static org.junit.Assert.*;
import java.util.LinkedList;
import org.junit.Test;

public class RecentListTest {

  private RecentList recentList;

  @Test
  public void firstTimeOpenedEmptyRecentList() {
    RecentList fileList = new RecentList();
    assertTrue (RecentList.getFileList().isEmpty());
  }

  @Test
  public void fileOpenedAddedRecentList() {
    RecentList file_1 = new RecentList ();
    file_1.addFile ("file1");
    assertEquals(1, file_1.getFileList ().size());
  }

  @Test
  public void existingOpenedFileTopRecentList() {
    RecentList list = new RecentList();
    list.addFile ("file1");
    list.addFile ("file1");
    assertEquals(1,list.getFileList().size());
    assertEquals(0,list.getFileList ().indexOf("file1"));
   }

  @Test
  public void oldestItemRemovedFromRecentList() {
    RecentList list = new RecentList ();
    list.addFile ("file1");
    list.addFile ("file2");
    list.addFile ("file3");
    list.addFile ("file4");
    list.addFile ("file5");
    list.addFile ("file6");
    list.addFile ("file7");
    list.addFile ("file8");
    list.addFile ("file9");
    list.addFile ("file10");
    list.addFile ("file11");
    list.addFile ("file12");
    list.addFile ("file13");
    list.addFile ("file14");
    list.addFile ("file15");
    list.addFile ("file16");
    assertEquals(15,list.getFileList ().size());
    assertEquals(0,list.getFileList ().indexOf("file16"));
  }
}
