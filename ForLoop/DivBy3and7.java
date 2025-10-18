//Print all numbers from 1 to 100 that are divisible by both 3 and 7
package ForLoop;
public class DivBy3and7 {
    public static void main(String[]args){
        System.out.println("\nThe number divisible by 3 and 7: ");
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%7==0){
                System.out.println(i);
            }
        }
    }
}
