package Lab01_Primitives_ControlFlow;

import  java.time.LocalDateTime;

public class CommandLineClock {
    public static void main(String[] args) {

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            String format = "%02d:%02d:%02d";
            String output = String.format(format, hour, minute, second);
            System.out.println(output);

            try {
                Thread.sleep(1000); //waits for next second before updating
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}