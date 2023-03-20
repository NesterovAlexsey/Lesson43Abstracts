package Task1House;

//    Создайте класс "Частный дом" - наследник класса "Дом".
public class PrivateHouse extends House {

  public PrivateHouse(String address) {
    super(address);
  }

  //    Добавьте классу "Дом" виртуальный метод "снести".
  //    Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":
  //    для частного дома выводите на экран: "Вы снесли частный дом";
  @Override
  public void destroyHouse() {
    System.out.println("Вы снесли частный дом");
  }
}
