public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {        /*  в этом методе решение задач с 1 по 3 включительно
                                         т.к. задача 1/2/3 используют общие переменные */
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() { //  в этом методе решение задач с 4 по 5 включительно

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task3() { //  в этом методе решение задач с 6 по 8 включительно
        System.out.println("Задача 6");
        var weightB1 = 78.2;
        var weightB2 = 82.7;
        var totalWeight = weightB1 + weightB2;
        var diffWeight = weightB2 - weightB1;
        System.out.println("Общий вес двух бойцов : " + totalWeight + " кг.");
        System.out.println("Разница в весе двух бойцов : " + diffWeight + " кг.");

        System.out.println("Задача 7");
        var diffWeight2 = weightB2 - weightB1; //данную разницу мы уже находили в задаче 6, не понял зачем дублировать
        var diffWeight3 = weightB2 % weightB1;
        System.out.println(diffWeight2);
        System.out.println(diffWeight3);

        System.out.println("Задача 8");
        var totalHours = 640;
        var oneStaffHours = 8;
        var totalStaff = totalHours / oneStaffHours;
        System.out.println("Всего работников в компании — " + totalStaff + " человек.");

        var totalStaff2 = totalStaff + 94;
        var oneStaffHours2 = totalHours / totalStaff2;
        System.out.println("Если в компании работает " + (totalStaff2) + " человек, то всего " + oneStaffHours2 + " часов работы может быть поделено между сотрудниками");
    }
}
/* насколько я понял в пулл реквест уходит только второстепенные ветки для одобрения слияния,
а в код уходит мастер ветка. Поэтому не совсем понятно, нужно ли писать ДЗ сразу в мастер ветке
или лучше симпл код пушнуть на мастер, а в новом бранче написать ДЗ которое сразу уйдет в пулл реквест?!
Пока пишу этот коммент , чтобы были отличия для нового бранча.
 */
