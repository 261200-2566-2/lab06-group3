public class Wizard implements Character{ // Wizard have advantages over Warrior on DEFENSE and MANA
    private int level;
    private double maxHp, currentHp, maxMana, currentAtk=5, currentDef=15, currentMana;

    /** Create an Object of 'Wizard' Class and set the default field.
     * effects: initialize each character field
     * @param level of character you want to create
     */
    public Wizard(int level){ // Warrior Constructor | Stats init different from Warrior
        this.level = level;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
        currentHp = maxHp; // Set HP
        currentMana = maxMana; // Set Mana
    }

    /** Increase currentHp and Reduce currentMana of this Character.
     * effects: if this character doesn't have enough mana you can't heal
     * effects: if currentHp that is increased has reached the maximum Hp set the current equals to Maximum HP
     */
    public void heal(){
        if(currentMana < 10) System.out.println("You can't // Don't have Enough Mana !"); // No mana to consume
        currentHp += 10;
        if(currentHp > maxHp) currentHp = maxHp; // Over Max
        currentMana -= 10; // Consume Mana to heal
    }

    /** Increase Level of Character by 1 and then update the status.
     * effects: Increase level , update maxHp and maxMana
     */
    public void levelUp(){ // Difference from Warrior
        level++;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
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
    public void getAttacked(double atk){ // Damage Reduced Different from Warrior ( More dmg taken than warrior) [ vulnerable]
        currentHp -= atk-0.3*currentDef;
        if(currentHp < 0) currentHp = 0;
    }

    /** Equip the accessories to this Character and acquire its stats.
     * effects: if equip wrong type of accessories print the error message
     * effects: if equip right type of accessories added the specify stats of accessories to Character stats
     * @param a is Accessories you want to equip
     */
    public void EquipAccessories(Accessories a){ // Wizard can Equip only necklace | Can't Equip Ring
        if(a.typeCheck() == 2){ // Case Necklace
            currentAtk += a.getStats();
        }else{ // Case Ring | Can't do it Return an Error Message
            System.out.println("<<< You can't Equip Ring // Only Warrior Can ;) >>>");
        }
    }

    /** Print Each status of this Character Line by Line.
     * effects: Print Each of statuses of this Character.
     */
    public void printStat(){ // Print Wizard Stats
        System.out.println("=======================================");
        System.out.println("Character Class: Wizard\nMaxHp: "+maxHp+"\nCurrentHp: "+currentHp+"\nMaxMana: "+maxMana+"\nCurrentMana: "+currentMana+"\nCurrentAtk: "+currentAtk+"\nCurrentDef: "+currentDef);
        System.out.println("=======================================");
    }
}
