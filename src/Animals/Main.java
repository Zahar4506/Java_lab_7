package Animals;
/*
    1.	Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: Я не корова, Я – кит.
    2.	Написать метод, который определяет, объект какого класса ему передали,
        и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
    3.	Создать два класса Cat(кот) и Dog(собака), класс Dog(собака) происходит от Cat(кот).
        Определить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.

        Задачи на перегрузку методов
1.	Написать два метода: print(int) и print(String).
2.	Написать два метода: print(int) и print(Integer).Написать такой код в методе main, чтобы вызвались они оба.
3.	Написать пять методов print с разными параметрами.
4.	Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
 Каждый метод должен возвращать минимальное из двух переданных в него чисел.
5.	Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
 Каждый метод должен возвращать максимальное из двух переданных в него чисел.


*/

public class Main {
    public static int a = 0;
    public static int b = 46;
    public static long c = 123;
    public static long d = 123123;
    public static double e = 0.506;
    public static double f = 1.49;
    public static String str = "asd";
    public static boolean bool;
    public static Integer ab = 54;


    public static void main(String[] args) {
        //Cow cow = new Cow();
        Cow cow = new Cow();
        Whale wh = new Whale();
        Cat cat = new Cat();
        Dog dog = new Dog();
//        Dog dogi = dog.getChild();
//        Cat cati = cat.getChild();


        getInsatceOf(cow);
        getInsatceOf(wh);
        getInsatceOf(cat);
        getInsatceOf(dog);

        print(a);
        print(str);
        print(a, b);
        print(bool);
        print(ab);


//        System.out.println("Минимум ="+min(a,b)+" Минимум ="+min(c,d)+" Минимум ="+min(e,f));
//        System.out.println("Максимум ="+max(a,b)+" Максимум ="+max(c,d)+" Максимум ="+max(e,f));

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static long min(long a, long b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static double min(double a, double b) {
        if (a < b) {
            return a;
        } else return b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }

    public static long max(long a, long b) {
        if (a > b) {
            return a;
        } else return b;
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else return b;
    }


    public static void getInsatceOf(Object object) {
        while (true) {
            if (object instanceof Cat) {
                try {
                    object = (Dog) object;
                    System.out.println("Это псюга");
                    break;
                } catch (Exception e) {
                    System.out.println("Это кошак");
                    break;
                }
            }
            if (object instanceof Cow) {
                try {
                    object = (Whale) object;
                    System.out.println("Это кит");
                    break;
                } catch (Exception e) {
                    System.out.println("Это корова");
                    break;
                }
            }
        }
    }
/*        Задачи на перегрузку методов
1.	Написать два метода: print(int) и print(String).
2.	Написать два метода: print(int) и print(Integer).Написать такой код в методе main, чтобы вызвались они оба.
3.	Написать пять методов print с разными параметрами.
.*/

    public static void print(int a) {
        System.out.println("вывод инт " + a);
    }

    public static void print(String str) {

        System.out.println("вывод строки " + str);
    }

    public static void print(boolean bool) {
        System.out.println("вывод булеан " + bool);
    }

    public static void print(Integer a) {
        System.out.println("вывод Integer " + a);
    }

    public static void print(int a, int b) {
        System.out.println("вывод a и b" + a + " " + b);
    }

}
