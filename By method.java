class Student{
    int id;
    String name;
    void insert(int a,String b){
        id = a;
        name = b;
    }
    void printobj(){
        System.out.print("Id : ");
        System.out.println(id);
        System.out.print("Name : ");
        System.out.println(name);
    }
}
class Main{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.insert(35,"Pankaj");
        s1.printobj();
    }
}
