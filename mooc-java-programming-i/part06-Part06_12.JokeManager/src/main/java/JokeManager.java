
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokesList;

    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokesList.add(joke);
    }

    public String drawJoke() {
        if (this.jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random random = new Random();
        int randomNumber = random.nextInt(this.jokesList.size());

        return this.jokesList.get(randomNumber);
    }

    public void printJokes() {
        if (this.jokesList.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }

        for (String joke : this.jokesList) {
            System.out.println(joke);
        }
    }
}
