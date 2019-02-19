package point2;

import java.util.ArrayList;

public class Blog {
  private ArrayList<Post> entryList;
  private String user;

  public Blog(ArrayList<Post> entryList, String user) {
    this.entryList = entryList;
    this.user = user;
  }

  public ArrayList<Post> getEntryList() {
    return entryList;
  }

  public void setEntryList(ArrayList<Post> entryList) {
    this.entryList = entryList;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Post getPost(int index){
    return entryList.get(index);
  }

  public boolean deleteEntry(Post entry) {
    return entryList.remove(entry);
  }

  public boolean containsEntry(Post entry) {
    return entryList.contains(entry);
  }

  public void addEntry(Post entry) {
    if (entryList.contains(entry)) {
      entryList.remove(entry);
    }
    entryList.add(0, entry);
  }

  public void showRecentEntries() {
    for (Post post : entryList) {
      System.out.println (post);
    }
  }

}
