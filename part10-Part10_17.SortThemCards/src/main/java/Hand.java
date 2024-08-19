
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        Iterator iterator = cards.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int sum(){
        Iterator<Card> iterator = cards.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            sum += iterator.next().getValue();
        }
        return sum;
    }
    
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sum() - hand.sum();
    }
}
