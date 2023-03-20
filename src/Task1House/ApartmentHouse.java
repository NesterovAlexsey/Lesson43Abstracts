package Task1House;

//    Создайте класс "Многоквартирный дом" - наследник класса "Дом".
public class ApartmentHouse extends House {

  //    При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
//    количество подъездов.
  final private int numberOfEntrance;

  public ApartmentHouse(String address, int numberOfEntrance) {
    super(address);
    this.numberOfEntrance = numberOfEntrance;
  }

  @Override
  public String toString() {
    return "Full house address is '" + address + ", " + numberOfEntrance + "';";
  }

  //    Добавьте классу "Дом" виртуальный метод "снести".
  //    Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
  //    для многоквартирного дома выведите на экран: "Вы снесли многоквартирный дом. %d подъездов!"
  //    Вместо %d должно быть число подъездов.
  @Override
  public void destroyHouse() {
    System.out.printf("Вы снесли многоквартирный дом. %d подъездов!%n", getNumberOfEntrance());
  }

  public int getNumberOfEntrance() {
    return numberOfEntrance;
  }
}
