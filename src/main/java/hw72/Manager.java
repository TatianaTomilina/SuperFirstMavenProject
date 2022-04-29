package hw72;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWorkDays() + numberOfSubordinates / 100.0;

        }
        return result;
    }
}
