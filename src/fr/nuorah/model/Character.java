package fr.nuorah.model;

public class Character {

    private int hp;
    private int maxHp;
    private int baseDmg;
    private double blockChance;
    private int strength;
    private int dexterity;
    private int constitution;

    public Character(int strength, int dexterity, int constitution){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.maxHp = strength + constitution*2;
        this.hp = maxHp;
        this.baseDmg = dexterity + strength*2;
        this.blockChance = (strength + dexterity*2)/100.0;
    }

    public void hit(Character character){
        int newHp = character.getHp() - (int)Math.floor((this.getBaseDmg()*blockChance) + 1);
        character.setHp(newHp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    public double getBlockChance() {
        return blockChance;
    }


    public void setBlockChance(double blockChance) {
        this.blockChance = blockChance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

}
