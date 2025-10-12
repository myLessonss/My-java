public class Countdown {
    public static void main(String [] args){
        int i=3;
        int j=0;
        do{
            System.out.println(i);
            i--;
        }
        while(i>0);
        System.out.println("Happy day");
    
    //Lets play "Yatzy" game we print Yatzy when dice print 6
        
        do{
            j+=1;
            if(j==6){
            System.out.println("YATZY");
           }else{
            System.out.println("IT IS NOT YATZY");
           }
        }while(j<6);
    }
}

