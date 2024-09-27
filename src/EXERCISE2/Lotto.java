package EXERCISE2;

import java.util.Random;

public class Lotto {

    Random rand = new Random();

    int[] randInt = new int[3];

    public Lotto(int[] randInt) {
        this.randInt = randInt;
    }

    public Lotto() {
        for (int num = 0; num < randInt.length; num++) {
            randInt[num] = rand.nextInt((9 - 1) + 1) + 1;
        }
    }

    public int[] arrayLotto() {
        return randInt;
    }
}
