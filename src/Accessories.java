public interface Accessories { // There's Ring and Necklace | Each Added up Different Stats to The Characters
    double getStats(); // Stat get from each accessories (May be different Stats depends on type of accessories) - Ring increases Character's HP - Necklace increase Character's Atk

    /** Get Type check of the Accessories.
     *
     * @return 1 or 2
     * if 1 then this Accessory is ring
     * else if 2 then this Accessory is necklace
     */
    int typeCheck(); // Check type of accessories (Whether Ring or Necklace)
}
