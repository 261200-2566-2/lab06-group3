public class Ring implements Accessories{ // Ring , Can only equip by Warrior
    private double HpIncreasedFromRing; // Stats increase to Character

    /** Create a Ring Object.
     * effects: set the stats of ring
     */
    Ring(){ // Ring constructor
        HpIncreasedFromRing=10;
    }

    /** Get Status of this ring.
     * @return Hp stat of this ring
     */
    public double getStats(){ // get Hp Increased From Ring
        return HpIncreasedFromRing;
    }

    /** Return type of an Accessory
     * It's necklace so it's return 1
     * @return 1
     */
    public int typeCheck(){ // If 1 It's ring | if 2 It's Necklace
        return 1;
    }
}
