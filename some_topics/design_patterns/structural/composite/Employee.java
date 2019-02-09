package composite;

public interface Employee {

    public String getName();
    public double getSalary();
    public void print();
    public Employee getChild(int index);
    public void add(Employee employee);
    public void remove(Employee employee);


}
