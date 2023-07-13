// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to the flight!" + "\n");
        System.out.print("Selecting your movies based with 30m leeway from arrival time" + "\n");

        int FlightDuration = 250;
        int leeway = 30;
        FlightDuration = FlightDuration - leeway;

        List<Integer> MovieDuration = new ArrayList<>();
        MovieDuration.add(90);
        MovieDuration.add(85);
        MovieDuration.add(75);
        MovieDuration.add(60);
        MovieDuration.add(120);
        MovieDuration.add(150);
        MovieDuration.add(125);
        int[] selectedPair = findPairOfMovies(MovieDuration, FlightDuration);

        System.out.println("Selected Movie Pair: [" + selectedPair[0] + ", " + selectedPair[1] + "]");

    }

    static int[] findPairOfMovies(List<Integer> MovieDuration, int FlightDuration) {
        int[] selectedPair = new int[2];
        int maxDuration;
        for (int i = 0; i < MovieDuration.size(); i++) {
            for (int j = i + 1; j < MovieDuration.size(); j++) {
                int a = MovieDuration.get(i);
                int b = MovieDuration.get(j);
                maxDuration = MovieDuration.get(selectedPair[0]) + MovieDuration.get(selectedPair[1]);
                if (a + b <= FlightDuration && a + b > maxDuration) {
                    selectedPair[0] = i;
                    selectedPair[1] = j;
                }
            }
        }
        return selectedPair;
    }
}

