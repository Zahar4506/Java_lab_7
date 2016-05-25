package Animals;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public class Truck implements PassangersAuto, CargoAuto{

    @Override
    public void gruz() {
        System.out.println("Я фура я таскаю очень много груза");
    }

    @Override
    public void passanger() {
        System.out.println("А вот пассажиров я вожу всего 2");

    }
}
