public class Main {
  public static void main(String[] args) {
    Sword sword = new Sword("Excalibur", 50, 3.5, "Mythical Steel");
    Bow bow = new Bow("Longbow", 30, 2.0, 50);
    MagicWand wand = new MagicWand("Elder Wand", 100, 1.0, "Lightning Bolt");

    sword.displayInfo();
    sword.use();

    System.out.println();

    bow.displayInfo();
    bow.use();

    System.out.println();

    wand.displayInfo();
    wand.use();

    System.out.println("\nTotal weapons created: " + Weapon.getWeaponCount());
  }
}
