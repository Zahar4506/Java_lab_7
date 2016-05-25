package Animals;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public class Picup implements PassangersAuto, CargoAuto {
    @Override
    public void gruz() {
        System.out.println("Я вожу много веса, до тонны");
    }

    @Override
    public void passanger() {
        System.out.println("Я вожу всего 4-5 человек");

    }
}
