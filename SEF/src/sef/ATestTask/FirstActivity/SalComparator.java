package sef.ATestTask.FirstActivity;


import java.util.Comparator;

public class SalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        double o1Salary = ((Employee)o1).getSalary();
        double o2Salary = ((Employee)o2).getSalary();

        if (o1Salary > o2Salary)
            return 1;
        else if (o1Salary < o2Salary)
            return -1;
        else
            return 0;
    }
}






        return 0;
    }
}
