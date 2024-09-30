class MagicWand extends Weapon {
  private String spellType;

  public MagicWand() {
    super();
    this.spellType = "Fireball";
  }

  public MagicWand(String name, int damage, double weight, String spellType) {
    super(name, damage, weight);
    this.spellType = spellType;
  }

  public String getSpellType() {
    return spellType;
  }

  public void setSpellType(String spellType) {
    this.spellType = spellType;
  }

  public void use() {
    System.out.println(getName() + " casts a spell: " + spellType + " with damage: " + getDamage());
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Spell Type: " + spellType);
  }
}
