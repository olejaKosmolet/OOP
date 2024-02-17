package ООП.Lection2.Ex004;

public class Druid extends BaseHero {

    public Druid(String name, int hp, int mp) {
        super(name, hp, mp);
        System.out.println("Вызван Druid(String name, int hp)");

    }

    public Druid() {
        this("", 0, 0);
        //super("", 0);
        System.out.println("Вызван Druid()");
    }
}