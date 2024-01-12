class Student{
    int id;
    String name;
}
class Main{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Pankaj";
        s1.id = 35;
        System.out.println(s1.id + " " + s1.name);
    }
}
