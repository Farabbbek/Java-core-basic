public class Arraylength {
    public static void main(String[] args){
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for(int i = 0;i < cars.length;i++){
            if("Ford".equals(cars[i])){
                System.out.println("Found Ford at index " + i);
                break;
            }
        }
    }
}
