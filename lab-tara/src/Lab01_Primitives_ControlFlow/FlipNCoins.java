package Lab01_Primitives_ControlFlow;

import java.lang.Math;

public class FlipNCoins {
    public static void main(String[] args) {
        flipNHeads(5);
    }

    public static void flipNHeads(int n) {
        int heads = 0;
        int flips = 0;

        while (heads != n) {
            double random = Math.random();

            if (random >= .5) {
                System.out.println("Heads");
                heads++;
                flips++;
            } else {
                heads = 0;
                System.out.println("Tails");
                flips++;
            }
        }
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
}