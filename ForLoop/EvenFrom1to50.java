//Print even numbers between 1 and 50.
package ForLoop;
public class EvenFrom1to50{
    public static void main(String[]args){
        System.out.println("\nEven numbers btn 0 and 50 are: ");
        for(int i=1;i<50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

