package composite;

public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
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
        System.out.println("developer : " + getName() + ", salary : " + getSalary() );
    }

    @Override
    public Employee getChild(int index) {
        //this is leaf node so this method is not applicable to this class.
        return null;
    }

    @Override
    public void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }
}
