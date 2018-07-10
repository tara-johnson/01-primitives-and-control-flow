package Lab01_Primitives_ControlFlow;

public class Pluralize {

    public static void main(String[] args) {
        int thingCount = 5;
        System.out.println("I own " + thingCount + " " + pluralize("dog", thingCount));
    }

    public static String pluralize(String own, int thingCount) {
        if (thingCount == 0 || thingCount >= 2) {
            return (own + "s.");
        } else {
            return (own + ".");
        }
    }
}