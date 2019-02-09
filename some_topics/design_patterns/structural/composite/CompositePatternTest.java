package composite;


/*
    In a small organization,there are 5 employees.At top position,there is 1 general manager.
    Under general manager,there are two employees,one is manager and other is developer and
    further manager has two employees working under him.We want to print name and salary of
    all employees from top to bottom.

 */


public class CompositePatternTest {


    public static void main(String[] args) {


        Employee generalManager = new GeneralManager("Kevin", 25_000);

        Employee manager = new Manager("Lucas", 22_000);

        Employee developer1 = new Developer("Mark", 15_000);
        Employee developer2 = new Developer("Henry", 18_000);
        Employee developer3 = new Developer("Tom", 20_000 );


        generalManager.add(manager);
        generalManager.add(developer1);
        manager.add(developer2);
        manager.add(developer3);

        generalManager.print();




    }


}
