package Task1House;

//    Создайте абстрактный класс "Дом".
public abstract class House {

  String address;

  //В качестве аргумента конструктора принимайте адрес.
  public House(String address) {
    this.address = address;
  }

  //    Напишите для адреса геттер.
  public String getAddress() {
    return this.address;
  }

  //    Напишите для адреса сеттер
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    String result = "The house address is '" + address + "';";
    return result;
  }

}
