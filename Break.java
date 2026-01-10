public class Break{
    public static void main(String[] args){
        int num = 0;
        for(int i = 0;i < 10; i++){
            num++;
            if(num == 5){
                break;
            }
        }
        System.out.println("Limit reached " + num);
    } 
}
