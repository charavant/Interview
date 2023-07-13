// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to the flight!"+ "\n");
        System.out.print("Selecting your movies based with 30m leeway from arrival time"+ "\n");



        int FlightDuration=250;
        int[] MovieDuration = {90, 85, 75, 60, 120, 150, 125};
        int[] selectedPair = findPairOfMovies(MovieDuration, FlightDuration);

        System.out.println("Selected Movie Pair: [" + selectedPair[0] + ", " + selectedPair[1] + "]");

    }

    static int[] findPairOfMovies(int[] MovieDuration, int FlightDuration) {
        int[] selectedPair = new int[2];
        int maxDuration = 0;
        for (int i = 0; i < MovieDuration.length - 1; i++) {
            for (int j = i + 1; j < MovieDuration.length; j++) {
                int a = MovieDuration[i];
                int b = MovieDuration[j];
                maxDuration = MovieDuration[selectedPair[0]] + MovieDuration[selectedPair[1]];
                if (a + b <= FlightDuration && a + b > maxDuration) {
                    selectedPair[0] = i;
                    selectedPair[1] = j;
                }
            }
        }
        return selectedPair;
    }
}

