import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.score == player2.score) {
            return CharSequence.compare(player1.name, player2.name);
        } else {
            return player1.score - player2.score;
        }
    }
}
