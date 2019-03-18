package fr.nuorah;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static int randInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
