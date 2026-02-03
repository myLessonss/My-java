public class RecursiveFunction {
    public static int addNumbers(int start,int end){
        if(end>start){
            return end+ addNumbers(start, end-1);
        }else{
            return end;
        }
    }
    public static void main(String[] args) {
        int total=addNumbers(10, 1100);
        System.out.println(total);
        
    }
}
