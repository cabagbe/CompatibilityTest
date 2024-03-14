import java.util.Random;

public class Percentage {



    public int generateRandom(int random){

        Random randomNumber = new Random();
        random = randomNumber.nextInt(100) + 1;

        return random;
    }
}
