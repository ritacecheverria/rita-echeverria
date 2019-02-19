package point2;

import java.lang.reflect.Array;
import java.util.*;

public class Post {
  public String title= "";
  public String tag;
  public String body;

  public Post(String title, String tag, String body, int id) {
    this.title = title;
    this.tag = tag;
    this.body = body;
   }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post entry = (Post) o;
    return title.equals(entry.title) &&
        tag.equals(entry.tag) &&
        body.equals(entry.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, tag, body);
  }

  @Override
  public String toString() {
    return "Entry "+"title: '" + title + ". Tag= " + tag + ". Body: <" + body +".>";
  }
}

