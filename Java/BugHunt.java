public class BugHunt {

    public static void main(String[] args) {
        int i = 1;

        if(Integer.parseInt(args[0]) == 0) {

            // Diese Schleife soll alle GERADEN Zahlen zwischen 1 und 20 (inklusive 20) ausgeben.
            // Jede Zahl soll in einer eigenen Zeile ausgegeben werden.
            while (i < 20) {
                i++;
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if(Integer.parseInt(args[0]) == 1) {

            // Diese Schleife soll alle UNGERADEN Zahlen zwischen 1 und 20 (inklusive 1) ausgeben.
            // Jede Zahl soll in einer eigenen Zeile ausgegeben werden.
            for (; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}