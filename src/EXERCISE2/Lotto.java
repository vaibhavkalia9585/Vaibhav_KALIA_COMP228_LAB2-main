package EXERCISE2;

import java.util.Random;

public class Lotto {

    Random randnumber = new Random();

    int[] randInt = new int[3];
    public Lotto() {
        for (int num = 0; num < randInt.length; num++) {
            randInt[num] = randnumber.nextInt((9 - 1) + 1) + 1;
        }
    }
    public Lotto(int[] randInt) {
        this.randInt = randInt;
    }
    public int[] arrayLotto() {
        return randInt;
    }
}
