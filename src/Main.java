public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] salary = {12000, 90000, 11000, 10210, 12450};
        int sum = 0;
        for (int index = 0; index < salary.length; index++) {
            sum = sum + salary[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задача 2");
        int maxSalary = -1;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary + " рублей");
        int minSalary = 1000000;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей");

        System.out.println();
        System.out.println("Задача 3");

        int[] salary3 = {1231, 8726, 9087, 2454, 9834};
        int sum3 = 0;
        for (int i = 0; i < salary3.length; i++) {
            sum3 = (sum3 + salary3[i]) / salary3.length;
        }
        System.out.println(sum3);

        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = 10; i < reverseFullName.length; i--) { // получилось!!! Ура!!! Но, появился вопрос. Почему знак "<" не нужно менять на ">" ? Ведь я иду циклом от большего индекса массива к большему. Логично же, что нужно заменить знак или нет?
            System.out.print(reverseFullName[i]);
        }
    }
}