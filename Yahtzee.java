public class Yahtzee
{
    
    private int value;
    Die6 Die1 = new Die6();
    Die6 Die2 = new Die6();
    Die6 Die3 = new Die6();
    Die6 Die4 = new Die6();
    Die6 Die5 = new Die6();
    Die6[] cool = new Die6[] {Die1, Die2, Die3, Die4, Die5};
    
    public Yahtzee() {
        roll();
        getValue();
    }
    
    public void roll() {
        for (int i = 0; i < cool.length; i++) {
            cool[i].roll();
        }
    }
    
    public void roll(int dieNumber) {
        cool[dieNumber - 1].roll();
    }
    
    public int getValue() {
        value = 0;
        
        for (int i = 0; i < cool.length; i++) {
            value = value + cool[i].getValue();
        }
        
        return value;
    }
    
    public String toString() {
        String open = "";
        for (int i = 0; i < cool.length; i++) {
            open = open + " " + cool[i].getValue();
        }
        return "Dice values:" + open;
    }
    
    public String summarize() {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        
        for (int i = 0; i < cool.length; i++) {
            if (cool[i].getValue() == 1) {
                one = one + 1;
            }
            else if (cool[i].getValue() == 2) {
                two = two + 1;
            }
            else if (cool[i].getValue() == 3) {
                three = three + 1;
            }
            else if (cool[i].getValue() == 4) {
                four = four + 1;
            }
            else if (cool[i].getValue() == 5) {
                five = five + 1;
            }
            else if (cool[i].getValue() == 6) {
                six = six + 1;
            }
        }
        
        return "1-" + one + "; 2-" + two + "; 3-" + three + "; 4-" + four + "; 5-" + five + "; 6-" + six;
    }
    
        public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
