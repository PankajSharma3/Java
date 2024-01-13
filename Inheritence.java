class Employee{
    int salary = 100000;
}
class programmer extends Employee{
    int bonus=50000;
}
class Main{
    public static void main(String args[]){
        programmer p = new programmer();
        System.out.println("Salary: "+p.salary);
        System.out.println("Bonus: "+ p.bonus);
    }
}
