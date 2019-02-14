package Point1;

import java.util.LinkedList;


public class RecentList {


  private static LinkedList<String> fileList;
  private int listSize = 15;

  public RecentList() {
   fileList = new LinkedList<>();
  }

  public static LinkedList<String> getFileList() {
    return fileList;
  }

   public void setFileList(LinkedList<String> fileList) {
    RecentList.fileList = fileList;
  }

  /*If list contains file, put it on the top of the list.
  If list is full, remove last element. */

  public void addFile (String file){
    if (fileList.contains(file)) {
      fileList.set(0, file);

    } else if (fileList.size() == listSize) {
        fileList.removeLast();
        fileList.addFirst(file);
    }
      else {
        fileList.addFirst(file);
      }
    }
  }


