public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("EMPLOYEE ID: "+id);
        System.out.println("EMPLOYEE NAME: "+name);
        System.out.println("SALARY: "+salary);
    }
    public static void main(String[]args){
        Employee emp1=new Employee("Ariha",100,50000.0);
        emp1.displayInfo();
    }
}