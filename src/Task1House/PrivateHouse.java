package Task1House;

//    Создайте класс "Частный дом" - наследник класса "Дом".
public class PrivateHouse extends House {

  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public void destroyHouse(String address) {
    System.out.println("Вы снесли частный дом");
    setAddress(null);
  };
  //    В методе toString() выводите в удобном виде всю известную информацию о доме.
}
