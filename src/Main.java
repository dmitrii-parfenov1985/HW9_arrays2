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
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary + " рублей" );
        // знаю, что следующее решение не верное, но я не понимаю как изменить код, чтобы найти минимальное значение
        int minSalary = 1;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей");

        System.out.println();
        System.out.println("Задача 3");

        int [] salary_3 = {1231, 8726, 9087, 2454, 9834};
        int sum_3 = 0;
        for (int i = 0; i < salary_3.length; i++) {
           sum_3 = sum_3 + salary_3[i]; // возможно так: double averageSalary = sum_3 / 5;  и потом sout (averageSalary)
        }// тут я понимаю, что нужно завести новую переменную типа double и вычислить среднее значение, но не понимаю куда вставить этот код
        System.out.println(sum_3);

        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
        }
        System.out.print(reverseFullName);// я здаюсь... не нашёл в уроках как сделать реверс индексов массива
    }
}