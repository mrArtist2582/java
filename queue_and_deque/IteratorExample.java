import java.util.*;

public class IteratorExample {
  public static void main(String[] args) {
    ArrayList<String> playList = new ArrayList<>();

    playList.add("Song a");
    playList.add("Song b");
    playList.add("Song c");
    Iterator<String> iterator = playList.iterator();

    while (iterator.hasNext()) {
      String song = iterator.next();
      System.out.println("Playing: " + song);

      // Removing "Song B" while iterating
      if (song.equals("Song b")) {
        iterator.remove();
      }
    }
    System.out.println("Updated Playlist: " + playList);
  }
}
