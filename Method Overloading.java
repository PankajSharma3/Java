class Adder{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Main{
    public static void main(String args[]){
        Adder a = new Adder();
        System.out.println(a.add(2,3,4));
        System.out.println(a.add(2,3));
    }
}
