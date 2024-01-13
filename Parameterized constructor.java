class Student{
    int id;
    String name; 
    Student(int a,String b){
        id = a;
        name = b;
    }
}
class Main{
    public static void main(String args[]){
        Student s1 = new Student(12,"Pankaj"); //constructor is called
        System.out.println("ID : "+s1.id);
        System.out.println("Name : "+s1.name);
    }
}
