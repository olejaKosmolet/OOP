package ООП.Seminar1.Megicains;


import ООП.Seminar1.BaseCharacter;

public interface Magican {

    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);

    String getName();

}
