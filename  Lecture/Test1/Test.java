public class Test {
    int a;
    String name;
   
    public Test(String n,int age){
        name=n;
        a=age;
    }
    void display(){
        System.out.println(name+" You are "+a+" years old.");
    }
    public static void main(String[]args){
        Test obj=new Test("Eloi",23);
        obj.display();

    }
}
