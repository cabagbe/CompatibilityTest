import java.util.Scanner;

public class Main {

    static String nameone;
    static String nametwo;
    static Scanner scanner;
    static Percentage percentage;
    static int random;


    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        percentage = new Percentage();

        System.out.println("Hello, lovebirds! <3");

        System.out.println("Enter your names.");

        nameone = scanner.nextLine();
        nametwo = scanner.nextLine();

        System.out.println("Hello, " + nameone + " and " + nametwo + "!");
        System.out.println("Press Enter, and I will decide your fate...");

        scanner.nextLine();

        System.out.println("Calculating...");


        random = percentage.generateRandom(random);

        System.out.println(nameone + ", " + nametwo + "! You are " + random + "% compatible!");

        if (random <= 10){
            System.out.println("Yikes. Might wanna rethink this one...");
        } else if (random <= 20){
            System.out.println("There's a little bit there...but not enough to make this work.");
        } else if (random <= 30){
            System.out.println("That's... hmmm...eeehhh...");
        } else if (random <= 40){
            System.out.println("I can see a little bit of a spark.");
        } else if (random <= 50){
            System.out.println("Oooh, about halfway! It's looking alright.");
        } else if(random == 69){
            System.out.println("Haha nice");
        } else if (random <= 60){
            System.out.println("Hmm, yes, I think if you keep working at it, this can definitely work.");
        } else if (random <= 70){
            System.out.println("OMG! I can feel the heat!! <3 You are so cute together!");
        } else if (random <= 80){
            System.out.println("Wow!!! <3 You guys are so close to being perfect!!! ...Almost. ");
        } else if (random <= 90){
            System.out.println("OMGEEEE I'm shipping you two x3");
        } else if (random <= 100){
            System.out.println(" YOU GUYS ARE SO PERFECT WOWOWOWOWOWOOW!!!!!!!!!! <3 <3 <3 <3 <3 <3");
        }

    }
}

