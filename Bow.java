class Bow extends Weapon {
    private int range;

    public Bow() {
        super();
        this.range = 30;
    }

    public Bow(String name, int damage, double weight, int range) {
        super(name, damage, weight);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


    public void use() {
        System.out.println(getName() + " is shooting an arrow with damage: " + getDamage());
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Range: " + range);
    }
}

