public class Main {
    public static void main(String[] args) {
        Ring r = new Ring();
        Warrior w = new Warrior(10);
        w.EquipAccessories(r);

        Wizard z = new Wizard(10);
        z.EquipAccessories(new Necklace());

        w.printStat();
        z.printStat();

        System.out.println("Battle!");

        w.attack(z);
        z.attack(w);
        w.attack(z);

        w.printStat();
        z.printStat();
    }
}