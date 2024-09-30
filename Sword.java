
class Sword extends Weapon {
  private String material;

  public Sword() {
    super();
    this.material = "Steel";
  }

  public Sword(String name, int damage, double weight, String material) {
    super(name, damage, weight);
    this.material = material;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void use() {
    System.out.println(getName() + " is slashing with damage: " + getDamage());
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Material: " + material);
  }
}
