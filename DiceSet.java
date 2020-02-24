import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class DiceSet {

    private Die[] dice;

    public DiceSet(int sidesOnEachDie, int numberOfDice) {
      if (numberOfDice < 2 ){
        throw new IllegalArgumentException("At least two dice required");
      }
      if (sidesOnEachDie < 4){
        throw new IllegalArgumentException("Dice must have at least four sides");
      }
      this.dice  = new Die[numberOfDice];
      for (var i = 0; i < dice.length; i++){
          this.dice[i] = new Die(sidesOnEachDie, 1);
      }
    }

    public DiceSet(int sidesOnEachDie, int... values) {
      if (values.length < 2) {
       throw new IllegalArgumentException("At least two dice required");
     }
     if (sidesOnEachDie < 4) {
       throw new IllegalArgumentException("Dice must have at least four sides");
     }
        this.dice= new Die[values.length];
        for (var i=0; i < values.length; i++) {
            dice[i]=new Die(sidesOnEachDie, values[i]);
        }
      }

    public String descriptor() {
        return this.dice.length + "d" + this.dice[0].getSides() ;
    }

    public int sum() {
        int sum = 0;
        for(var i = 0; i < this.dice.length; i++){
            sum += this.dice[i].getValue();
        }
        return sum;

    }

    public void rollAll() {
      for(var i = 0; i < this.dice.length; i++){
           this.dice[i].roll();
       }
     }

    public void rollIndividual(int i) {
        this.dice[i].roll();
    }

    public int getIndividual(int i) {
        return this.dice[i].getValue();
    }

    public List<Integer> values() {
      var result = new ArrayList<Integer>();
         for (var i = 0; i < dice.length; i++){
           result.add(dice[i].getValue());
         }
         return result;

    }

    public boolean isIdenticalTo(DiceSet diceSet) {
      return true;

    }

    @Override public String toString() {
      var result = "";
         for (var i = 0; i < dice.length; i++){
             result += "[" + dice[i].getValue() + "]";
         }
           return result;
         }
}
