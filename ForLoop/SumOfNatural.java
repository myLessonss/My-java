//Find the sum of the first 20 natural numbers.
package ForLoop;
public class SumOfNatural{
    public static void main(String[]args){
        int sum=0;
        for(int i=0;i<=20;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
