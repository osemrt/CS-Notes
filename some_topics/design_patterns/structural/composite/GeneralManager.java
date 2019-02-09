package composite;

import java.util.ArrayList;
import java.util.List;

public class GeneralManager implements Employee {

    private String name;
    private double salary;

    private List<Employee> employees = new ArrayList<>();

    public GeneralManager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("general manager : " + getName() + ", salary : " + getSalary() );

        for(Employee manager : employees){
            manager.print();
        }

    }

    @Override
    public Employee getChild(int index) {
        return employees.get(index);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }
}
