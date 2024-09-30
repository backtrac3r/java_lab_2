
abstract class Weapon {
  private String name;
  private int damage;
  private double weight;
  private static int weaponCount = 0;

  // Конструктор по умолчанию
  public Weapon() {
    this.name = "Unnamed Weapon";
    this.damage = 0;
    this.weight = 0.0;
    weaponCount++;
  }

  // Конструктор с параметрами
  public Weapon(String name, int damage, double weight) {
    this.name = name;
    this.damage = damage;
    this.weight = weight;
    weaponCount++;
  }

  // Геттеры и сеттеры
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Статический метод для получения количества созданных объектов
  public static int getWeaponCount() {
    return weaponCount;
  }

  // Абстрактный метод для использования оружия
  public abstract void use();

  // Метод для отображения информации об оружии
  public void displayInfo() {
    System.out.println("Weapon Name: " + name);
    System.out.println("Damage: " + damage);
    System.out.println("Weight: " + weight);
  }
}
