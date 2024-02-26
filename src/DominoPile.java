import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void newStack6(){
        for (int i = 0; i <= 6; i++){
            for (int x = i; x<=6; x++){
                pile.add(new Domino(i, x));
            }
        }
    }

    public void shuffle() {
        ArrayList<Domino> shuffled = new ArrayList<>(pile);
        Random random = new Random();

        int size = shuffled.size();
        for (int i = size - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Domino temp = shuffled.get(i);
            shuffled.set(i, shuffled.get(j));
            shuffled.set(j, temp);
        }

        pile.clear();

        for (Domino domino : shuffled) {
            pile.add(domino);
        }
    }
}
