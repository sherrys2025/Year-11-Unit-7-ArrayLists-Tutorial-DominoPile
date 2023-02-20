import java.util.*;
public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList<>();
    }

    public void newStack6(){
        for (int i = 0; i < 7; i++){
            for (int j = i; j < 7; j++){
                Domino temp = new Domino();
                temp.setTop(i);
                temp.setBottom(j);
                pile.add(temp);
            }
        }
    }

    public void shuffleOptionOne(){
        Random rand = new Random();
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Domino> temp = new ArrayList<>();
        int ind = -1;
        for (int i = 0; i < pile.size(); i++){
            while (ind == -1 || (index.contains(ind))) {
                ind = rand.nextInt(pile.size());
            }
            temp.add(pile.get(ind));
            index.add(ind);
        }

        pile.clear();
        for (Domino t: temp){
            pile.add(t);
        }

    }

    public void shuffleOptionTwo(){
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int index = rand.nextInt(pile.size());
            int index2 = index;
            while (index2 == index) {
                index2 = rand.nextInt(pile.size());
            }

            Domino temp;

            temp = pile.get(index);

            pile.set(index, pile.get(index2));
            pile.set(index2, temp);

        }
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }
}
