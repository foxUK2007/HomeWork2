public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();
        System.out.println("Задание 2");
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();
        System.out.println("Задание 4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        System.out.println(frog + 4);
        System.out.println();
        System.out.println("Задание 6");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var totalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println(totalWeight);
        System.out.println();
        System.out.println("Задание 7");
        var differenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница в весе спортсменов" + " " + "=" + " " + differenceWeight + " " + "кг");
        var differenceWeight1 = (boxerTwoWeight % boxerOneWeight);
        System.out.println("Разница в весе спортсменов" + " " + "=" + " " + differenceWeight1 + " " + "кг");
        System.out.println();

        System.out.println("Задание 8");
        var totalTime = 640;
        var timeOneWorker = 8;
        var employee = totalTime / timeOneWorker;
        System.out.println("Всего работников в компании" + " " + employee + " " + "человек");

    }
}