package Task1House;//Задача 1
//    Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
//
//    Напишите для адреса сеттер и геттер.
//
//    Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
//
//    При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
//    количество подъездов.
//
//    В методе toString() выводите в удобном виде всю известную информацию о доме.
//
//    В основном файле программы создайте список домов,
//    в который поместите два частных дома и один многоквартирный.
//
//    Выведите информацию о домах в списке с использованием цикла for-each.

//
// Задача 2
//    Добавьте классу "Дом" виртуальный метод "снести".
//
//    Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
//
//    для частного дома выводите на экран: "Вы снесли частный дом";
//    для многоквартирного дома выведите на экран: "Вы снесли многоквартирный дом. %d подъездов!"
//    Вместо %d должно быть число подъездов.

import java.util.ArrayList;
import java.util.List;

public class MainHouse {

  public static void main(String[] args) {
    House testBuild1 = new ApartmentHouse("First test address", 4);
    House testBuild2 = new PrivateHouse("Second test address");
    House testBuild3 = new PrivateHouse("Third test address");

    List<House> someHouses = new ArrayList<>();
    someHouses.add(testBuild1);
    someHouses.add(testBuild2);
    someHouses.add(testBuild3);

    for (House num : someHouses) {
      System.out.println(num);
    }
  }
}
