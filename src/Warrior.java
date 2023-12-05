public class Warrior implements Character{ // Warrior have advantages over Wizard on ATK and HP
    private int level;
    private double maxHp, currentHp, maxMana, currentAtk=15, currentDef=5, currentMana;

    /** Create an Object of 'Warrior' Class and set the default field.
     * effects: initialize each character field
     * @param level of character you want to create
     */
    public Warrior(int level){ // Warrior Constructor | Stats init different from Wizard
        this.level = level;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        currentHp = maxHp; // Set HP
        currentMana = maxMana; // Set Mana
    }

    /** Increase currentHp and Reduce currentMana of this Character.
     * effects: if this character doesn't have enough mana you can't heal
     * effects: if currentHp that is increased has reached the maximum Hp set the current equals to Maximum HP
     */
    public void heal(){
        if(currentMana < 7) System.out.println("You can't // Don't have Enough Mana !"); // No mana to consume
        currentHp += 5;
        if(currentHp > maxHp) currentHp = maxHp; // Over Max
        currentMana -= 7;
    }

    /** Increase Level of Character by 1 and then update the status.
     * effects: Increase level , update maxHp and maxMana
     */
    public void levelUp(){ // Different from Wizard
        level++;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
    }

    /** Attack other Character.
     * effects: The target character get attacked
     * @param target Character you want to attack
     */
    public void attack(Character target){
        target.getAttacked(currentAtk);
    }

    /** Get Attacked by Other Character.
     * effects: Reduce currentHp of this Character
     * @param atk that received from other character
     */
    public void getAttacked(double atk){
        currentHp -= atk-0.7*currentDef;
    } // Different From Wizard (Stronger than Wizard) Damage reduced less than wizard

    /** Equip the accessories to this Character and acquire its stats.
     * effects: if equip wrong type of accessories print the error message
     * effects: if equip right type of accessories added the specify stats of accessories to Character stats
     * @param a is Accessories you want to equip
     */
    public void EquipAccessories(Accessories a){ // Warrior can Equip only ring // Can't Equip Necklace
        if(a.typeCheck() == 1){ // Case Ring
            maxHp += a.getStats(); // Hp stats from Ring
        }else{ // Case Necklace
            System.out.println("<<< You can't Equip Necklace // Only Wizard Can ;) >>>");
        }
    }

    /** Print Each status of this Character Line by Line.
     * effects: Print Each of statuses of this Character.
     */
    public void printStat(){
        System.out.println("=======================================");
        System.out.println("Character Class: Warrior\nMaxHp: "+maxHp+"\nCurrentHp: "+currentHp+"\nMaxMana: "+maxMana+"\nCurrentMana: "+currentMana+"\nCurrentAtk: "+currentAtk+"\nCurrentDef: "+currentDef);
        System.out.println("=======================================");
    }
}
