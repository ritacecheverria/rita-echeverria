package Point1;

import java.io.File;
import java.util.ArrayList;


public class RecentList {


  private static ArrayList<File> fileList;
  private int listSize;

  public RecentList() {
    this.listSize = listSize;
    this.fileList = new ArrayList<File>(listSize);
  }

  public static ArrayList<File> getFileList() {
    return fileList;
  }

  public int getListSize() {
    return listSize;
  }

  public void setFileList(ArrayList<File> fileList) {
    this.fileList = fileList;
  }

  public void setListSize(int listSize) {
    this.listSize = listSize;
  }
}
