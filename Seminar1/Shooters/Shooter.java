package ООП.Seminar1.Shooters;

import ООП.Seminar1.BaseCharacter;

public interface Shooter {
    
    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);
}
