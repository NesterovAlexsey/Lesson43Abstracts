package Task1House;

//    Создайте класс "Многоквартирный дом" - наследник класса "Дом".
public class ApartmentHouse extends House {

//    При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
//    количество подъездов.
  private int numberOfEntrance;

  public ApartmentHouse(String address, int numberOfEntrance) {
    super(address);
    this.numberOfEntrance = numberOfEntrance;
  }


}
