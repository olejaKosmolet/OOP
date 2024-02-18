package ООП.Lection1.Ex007;

public class Healer extends BaseHero {
    //protected static Random r;

    private Integer mana;
    private Integer maxMana;

    public Healer() {
        super(String.format("Hero_Magician #%d", ++Healer.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(80, 100);
        this.mana = maxMana;
        this.maxHp = Magician.r.nextInt(50, 150);
        this.hp = maxHp;
    }

    public Healer(Integer mana) {
        this.mana = mana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }

    public Integer getMana() {
        return mana;
    }

    public Integer getMaxMana() {
        return maxMana;
    }

    public void toHeal (BaseHero target){
        int heal = BaseHero.r.nextInt(5, 16);
        while (target.hp < maxHp) {
            target.getHealing(heal);
            mana -= heal / 2;
            if (target.hp == maxHp) {
                break;
            }
        }
    }
        
}
