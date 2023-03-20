package quest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Room {

  private final String title;

  private static int i = 0;

  private static int j = 0;

  public Room(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void roomCoordinate(int x, int y) {

    ArrayList<String> corridorWc = new ArrayList<>();
    corridorWc.add("Вы находитесь в коридоре");
    corridorWc.add("Вы находитесь в туалете");

    ArrayList<String> hallKitchen = new ArrayList<>();
    hallKitchen.add("Вы находитесь в зале");
    hallKitchen.add("Вы находитесь в кухне");

    ArrayList<ArrayList<String>> rooms = new ArrayList<>();
    rooms.add(corridorWc);
    rooms.add(hallKitchen);

    i = i + x;
    j = j + y;

    System.out.println(rooms.get(i).get(j));

  }
}
