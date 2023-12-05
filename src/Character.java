public interface Character {
    void attack(Character c);
    void getAttacked(double d); // Different Damage Taken between Warrior and Wizard
    void printStat();
    void levelUp(); // Different Stats scaling between Warrior and Wizard
    void EquipAccessories(Accessories a); // Each type of Character have constraints to equip accessories Says - Warrior Can only Equip Ring - Wizard Can Only Equip Necklace
    void heal(); // Add Hp Consumes Mana
}
