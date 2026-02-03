//Countdown using java
public class Countdown {
    public static void count(int n){
        System.out.println(n);
        count(n-1);
    }
    public static void main(String[] args) {
        System.out.println("The countdown");
        count(10);
    }
}
