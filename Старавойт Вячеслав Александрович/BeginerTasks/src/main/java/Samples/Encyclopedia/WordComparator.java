package Samples.Encyclopedia;

import java.util.Arrays;
import java.util.Locale;

public class WordComparator {
    private final String base;
    private String cmp;
    private long score=0;
    private long maxScore=0;
    private final int[] scores;

    public WordComparator(String base) {
        this(base,new int[]{0,1,4,8,10});
    }

    public WordComparator(String base,int[] scores) {
        this.scores=scores;
        this.base = base.toUpperCase();
    }

    public double compareTo(String word){
        score=0;
        maxScore=0;
        if (word!=null && word.length()>1){
            cmp=word.toUpperCase();
            for(int l=1;l<scores.length&&l<cmp.length();l++){
                for(int i=0;i<(cmp.length()-l+1);i++){
                    String part=cmp.substring(i,i+l);
                    if (base.indexOf(part)>=0){
                        score+=scores[l];
                    }
                    maxScore+=scores[l];
                }
            }
        }
        return getRate();
    }

    public double getRate() {
        if (getMaxScore()==0) return 0;
        return 1.0*getScore()/getMaxScore();
    }

    public long getMaxScore() {
        return maxScore;
    }

    public long getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Comparator{"+  base + " <=> " + cmp+ ", score=" + score + " of " + maxScore + ", rate=" +getRate()+'}';
    }
}
