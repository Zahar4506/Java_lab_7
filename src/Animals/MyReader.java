package Animals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by zleha_000 on 25.05.2016.
 */
public class MyReader {
    //Кострукция ввода данных с клавиатуры
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public boolean vibor = false;
    public String viborStr = "";

    //Алогритм выбора да или нет
    public void zapolnenieVibor() {
        System.out.println("Хотите изменить показатели или оставить по умолчанию?");
        try {
            viborStr = bufferedReader.readLine();
            if (viborStr.equals("Да") || viborStr.equals("да")) {
                vibor = true;
            } else{ System.out.println("Показатели остались по умолчанию");
                vibor = false;}
        } catch (Exception e) {
        }
    }
}
