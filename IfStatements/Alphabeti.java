//Input a character and check if it’s a vowel or consonant.
import java.util.Scanner;
public class Alphabeti {
    public static void main(String [] args){
        char chara;
        Scanner alphScanner=new Scanner(System.in);
        System.out.println("\nEnter in the character which is alphabeti you want: ");
        chara=alphScanner.next().charAt(0);
        if (('a'<chara && 'z'>chara)||('A'<chara && 'B'>chara)){
            if(chara=='a' || chara=='e'|| chara=='o' || chara=='i' || chara=='u' 
            || chara== 'A'|| chara=='E' || chara=='O' ||chara=='U'||chara=='I'){
                System.out.println("Your "+chara+" is VOWEL");
            }else{
                System.out.println("Your "+chara+" is CONSONANT");
            }
        }
    } 
}
