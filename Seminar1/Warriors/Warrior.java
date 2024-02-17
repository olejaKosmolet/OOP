package ООП.Seminar1.Warriors;


import ООП.Seminar1.BaseCharacter;

public interface Warrior {
    
    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);

}
