package quest;

//Задача 3* (не обязательно)
//Попробуйте дописать квесту из классной работы перемещение по комнатам.
//
//Вариант № 1: для перемещения по карте каждой комнате можно задать координаты
// и хранить комнаты в двумерном списке List<List<Room>> или двумерном массиве Room[][].
//
//Вариант № 2: для каждой комнаты можно записать ссылки на её соседей (Room left, Room right...)
// и использовать существующее поле Room current класса Game.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainQuest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Game mainQuest = new Game();
    mainQuest.start(br);
  }
}
