public class Main {

        private static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
                employees[0] = new Employee("Иванов Иван Иванович", 1, 10000);
                employees[1] = new Employee("Петров Петр Петрович", 3, 12000);
                employees[2] = new Employee("Белоусова Дарья Петровна", 4, 15000);
                employees[3] = new Employee("Савкина Алена Андреевна", 2, 13000);
                employees[4] = new Employee("Протасова Елена Анатольевна", 5, 14000);

                print();
                System.out.println("Сумма ЗП сотрудников " + calculateSumOfSalaryes());
                System.out.println("Сотрудник с минимальной оплатой " + findEmployeeWihtMinSalary());
                System.out.println("Сотрудник с максимальной оплатой " + findEmployeeWihtMaxSalary());
                System.out.println("Средняя ЗП " + calculateAveregeOfSalaryes());
                printFullName();
        }

        private static void print() {
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null) {
                                System.out.println(employees[i]);
                        }
                }
        }

        private static int calculateSumOfSalaryes() {
                int sum = 0;
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null) {
                                sum += employees[i].getSalary();
                        }
                }
                return sum;
        }

        private static Employee findEmployeeWihtMinSalary() {
                Employee employeeWihtMinSalary = null;
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null && (employeeWihtMinSalary == null || employees[i].getSalary() < employeeWihtMinSalary.getSalary())) {
                                employeeWihtMinSalary = employees[i];

                        }
                }
                return employeeWihtMinSalary;
        }

        private static Employee findEmployeeWihtMaxSalary() {
                Employee employeeWihtMaxSalary = null;
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null && (employeeWihtMaxSalary == null || employees[i].getSalary() > employeeWihtMaxSalary.getSalary())) {
                                employeeWihtMaxSalary = employees[i];

                        }
                }
                return employeeWihtMaxSalary;
        }

        private static double calculateAveregeOfSalaryes() {
                int a = 0;
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null) {
                                a++;
                        }
                }
                return calculateSumOfSalaryes() / a;
        }

        private static void printFullName() {
                for (int i = 0; i < employees.length; i++) {
                        if (employees[i] != null) {
                                System.out.println(employees[i].getFullName());
                        }
                }
        }
}
/* Доброго времени , сделал базовое задание,
постараюсь успеть сделать все остальные сложности ,
но пока здаю так , не всегда на все хватает время.
 */