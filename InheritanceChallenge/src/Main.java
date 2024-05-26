import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        Employee ajay = new Employee("Ajay", "11/11/2010", "12/08/2022");
        System.out.println(ajay);
        System.out.println("Age = "+ajay.getAge());
        SalariedEmployee joe = new SalariedEmployee("Joe", "12/11/2009",
                "11/02/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = "+ joe.getAge());
        System.out.println("Joe's Paycheck = $"+joe.collectPay());
        joe.retire();
        System.out.println("joe's pension check $"+joe.collectPay());
        HourlyEmployee daniel = new HourlyEmployee("Daniel", "05/05/2007",
                "05/07/2027", 15);
        System.out.println(daniel);
        System.out.println("Daniel's Paycheck is $"+daniel.collectPay());
        System.out.println("Daniel's Holiday's Paycheck is $"+daniel.getDoublePay());
    }
}