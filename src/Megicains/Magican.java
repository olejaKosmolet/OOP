package Megicains;

public interface Magican {

    void attack (BaseCharacter target);

    void GetDamage(BaseCharacter target, int damage);

    void death(BaseCharacter target);

    String getName();

}