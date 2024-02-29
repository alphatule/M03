public class Main {
    public static void main(String[] args) {
        System.out.println(twoValuesAreZero(2,3));

    }
    public static String twoValuesAreZero(int num1, int num2){
        String info = "";

        if(num1 == 0){
            if(num2 == 0){
                info = "The two values are zero!";
            }
            else{
                info = "The second value is not zero.";
            }
        }
        else{
            info = "The first value is not zero.";
        }

        return info;
    }
}
