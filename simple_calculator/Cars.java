public class Cars {
    public static void main(String[]args){
        String[] car={"BMW","BENZ","TESLA","TOYOTA","BYD\n"};
        int ages[]={20,13,48,45,23,1,60,7};
        //Array to list names of cars
        System.out.println(car.length);
        for(int i=0;i<5;i++){
            System.out.println(car[i]);
        }
        //Array to calculate the lowest age 
        int lowestAge=ages[0];
        for(int j=0;j<ages.length;j++){
            if(lowestAge<ages[j]){
                lowestAge=ages[j]; 
            }

        }
        System.out.println(lowestAge);

    }
}

