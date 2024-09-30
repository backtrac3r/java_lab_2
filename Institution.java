abstract class Institution {
  private String name;
  private String location;
  private int capacity;
  private static int institutionCount = 0;

  // Конструктор по умолчанию
  public Institution() {
    this.name = "Unnamed Institution";
    this.location = "Unknown Location";
    this.capacity = 0;
    institutionCount++;
  }

  // Конструктор с параметрами
  public Institution(String name, String location, int capacity) {
    this.name = name;
    this.location = location;
    this.capacity = capacity;
    institutionCount++;
  }

  // Геттеры и сеттеры
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  // Статический метод для получения количества созданных объектов
  public static int getInstitutionCount() {
    return institutionCount;
  }

  // Абстрактный метод для описания деятельности учреждения
  public abstract void describeActivity();

  // Метод для отображения информации об учреждении
  public void displayInfo() {
    System.out.println("Institution Name: " + name);
    System.out.println("Location: " + location);
    System.out.println("Capacity: " + capacity);
  }
}
