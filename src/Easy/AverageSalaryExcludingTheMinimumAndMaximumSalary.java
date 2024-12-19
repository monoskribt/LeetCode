package Easy;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);

        if(salary.length == 1 || salary.length == 2) {
            return 0.0;
        }

        if(salary.length == 3) {
            return salary[1];
        }

        double sum = 0.0;
        double average = 0.0;

        for(int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            average = sum / i;
        }

        return average;

    }


    public static void main(String[] args) {
        int[] num = {1000,2000,3000};

        double result = average(num);
        System.out.println(result);
    }
}
