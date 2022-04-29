package hw7;

public class EmployeeUtils {
//    поиск сотрудника в массиве по его имени

    public static Worker findWorkerByName(Worker[] workers, String name){
     for (int i = 0; i < workers.length; i++) {
         if (name.equals(workers[i].getName())) {
             return workers[i];
         }
     }
     return null;
    }

//        поиск сотрудника в массиве по вхождению указанной строки в его имени
       public static Worker findWorkerBySubName(Worker[] workers, String subName){
            for (int i = 0; i < workers.length; i++) {
              if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
         }
        return null;
      }

//        подсчет зарплатного бюджета для всех сотрудников в массиве
public static double salarySum(Worker[] workers){
        double sum = 0;
    for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
    }
    return sum;
}

//        поиск наименьшей зарплаты в массиве
//        поиск наибольшей зарплаты в массиве
//        поиск наименьшего количества подчиненных в массиве менеджеров
//        поиск наибольшего количества подчиненных в массиве менеджеров
//        поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//        поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров


}