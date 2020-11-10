public class MyClass{
    public static void main(String[] args) {
        double sideAmount = 5;
        if(sideAmount % 2 == 0){
            System.out.println("The sngle zise of the regular polygon is: " + (180*(sideAmount - 2))/sideAmount);
        }else{
            System.out.println("The area of the regular polygon is: " + 0.25 * sideAmount * Math.pow(15, 2) * 1 / Math.tan(Math.PI/sideAmount));
        }
    }
}
