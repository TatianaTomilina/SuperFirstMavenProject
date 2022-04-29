package hw72;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Sergey", 30,'M', 1000);

        Month[] months = {new Month("Jan",31, 21),
                         new Month("Feb", 28, 20)};

        Manager manager = new Manager("Anna", 30,'F',1000, 30);



        System.out.println(manager.getSalary());
    }
}
