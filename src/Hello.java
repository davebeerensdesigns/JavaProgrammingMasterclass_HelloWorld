public class Hello {
    public static void main(String[] args){

        System.out.println("Hello, Dave");

        boolean isAlien = false;
        if(!isAlien){
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens!");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90 ) || (secondTopScore <= 90 )){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double calculatedValue = (firstValue + secondValue) * 100.00d;
        System.out.println("Calculated total = " + calculatedValue);
        double remainderValue = calculatedValue % 40.00d;
        System.out.println("Remainder value = " + remainderValue);
        boolean hasRemainder = remainderValue == 0;
        System.out.println("hasRemainder = " + hasRemainder);
        if(!hasRemainder){
            System.out.println("Got some remainder");
        }
    }
}
