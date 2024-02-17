package ООП.Lection2.Ex004;

public abstract class BaseHero {

    int mp;

    public BaseHero(String name, int hp, int mp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
        this.mp = mp;
    }

    public BaseHero() {
        this("", 0, 0);
        System.out.println("Вызван BaseHero()");
    }
}