

package dice;

public class dice {
    private int dice1;
    private int dice2;
    private boolean dub;

    public dice(int _dice1, int _dice2, boolean _dub) {
        this.dice1 = _dice1;
        this.dice2 = _dice2;
        this.dub = _dub;
    }

    public int getDice1() {
        return this.dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public int getDice2() {
        return this.dice2;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public boolean isDub() {
        return this.dub;
    }

    public void setDub(boolean dub) {
        this.dub = dub;
    }
}
