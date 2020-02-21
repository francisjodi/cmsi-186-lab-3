import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiceSet {

    private Die[] dice;

    public DiceSet(int sidesOnEachDie, int numberOfDice) {
      if (numberOfDice < 2 ){
        throw new IllegalArgumentException("At least two Dice are required");
      }
      if (sidesOnEachDie < 4){
        throw new IllegalArgumentException("Dice must have at least four sides");
      }
      this.dice  = new Die[numberOfDice];
      for (var i = 0; i < dice.length; i++){
          this.dice[i] = new Die(sidesOnEachDie, 1);
      }
    }

    /**
     * Creates a DiceSet where each die has the given number of sides, with the
     * given values.
     */
    public DiceSet(int sidesOnEachDie, int... values) {
        // TODO
    }

    /**
     * Returns the descriptor of the dice set; for example "5d20" for a set with
     * five dice of 20 sides each; or "2d6" for a set of two six-sided dice.
     */
    public String descriptor() {
        return "";

    }

    /**
     * Returns the sum of the values of each die in the set.
     */
    public int sum() {
        return 0;

    }

    /**
     * Rolls all the dice in the set.
     */
    public void rollAll() {
        // TODO
    }

    /**
     * Rolls the ith die, updating its value.
     */
    public void rollIndividual(int i) {
        // TODO
    }

    /**
     * Returns the value of the ith die.
     */
    public int getIndividual(int i) {
        return 0;

    }

    /**
     * Returns the values of each of the dice in a list.
     */
    public List<Integer> values() {
        return List.of();

    }

    /**
     * Returns whether this dice set has the same distribution of values as
     * an other dice set. The two dice sets must have the same number of dice
     * and the same number of sides per dice, and there must be the same
     * number of each value in each set.
     */
    public boolean isIdenticalTo(DiceSet diceSet) {
      return false;

    }

    /**
     * Returns a string representation in which each of the die strings are
     * joined without a separator, for example: "[2][5][2][3]".
     */
    @Override public String toString() {
      return "";

    }
}
