package ООП.Seminar1;

/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.
 */

 /*Крестьянин:
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружия
  - Уровень
  - ID
  - Имя

  Разбойник:
  - ID
  - Имя
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружиня

  Снайпер
  - ID
  - Имя
  - Здоровье
  - Сила
  - Ловкость
  - Выносливость
  - Вид оружия
  - Меткость
  - Маскировка

  Колдун:
  - ID
  - Имя
  - Здоровье
  - Интеллект
  - Выносливость
  - Вид оружия
  - Мана

  Копейщик:
  - ID
  - Имя
  - Здоровье
  - Сила
  - Выносливость
  - Вид оружия
  - Защита

  Арбалетчик:
  - ID
  - Имя
  - Здоровье
  - Выносливость
  - Вид оружия
  - Меткость
  - Количество стрел
  - Скорость стрельбы

  Монах:
  - ID
  - Имя
  - Здоровье
  -Выносливость
  - Вид оружия
  - Интеллект
  - Вера
  - Чакра

*/
public class Main {
    public static void main(String[] args) {
        
        Sniper sniper = new Sniper(0, "Alex", 0, 0, null, 0, 0);
        Crossbowman crossbowman = new Crossbowman(0, "Philip", 0, 0, null, 0, 0);
        Magic magic = new Magic(0, "Paul", 0, 0, null, 0, 0);
        Peasant peasant = new Peasant(0, "Shon", 0, 0, null, 0, 0);
        Spearman spearman = new Spearman(0, "Denis", 0, 0, null, 0, 0);

        System.out.println(sniper.getInfo());
        System.out.println(crossbowman.getInfo());
        System.out.println(magic.getInfo());
        System.out.println(peasant.getInfo());
        System.out.println(spearman.getInfo());

    }
}
