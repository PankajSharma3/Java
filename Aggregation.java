class Operation{
    int square(int a){
        return a*a;
    }
}
class Circle{
    Operation a;//aggregation
    double pi = 3.14;
    double area(int radius){
        a = new Operation();
        int c = a.square(radius);
        return pi*c;
    }
    public static void main(String args[])
    {
        Circle a = new Circle();
        double area = a.area(5);
        System.out.println(area);
    }
}
