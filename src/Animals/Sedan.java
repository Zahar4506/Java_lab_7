package Animals;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public class Sedan implements PassangersAuto, CargoAuto{
    @Override
    public void gruz() {
        System.out.println("Я седан я вожу до 400 литров");
    }

    @Override
    public void passanger() {
        System.out.println("Я вожу целых 5 пассажиров");

    }
}
