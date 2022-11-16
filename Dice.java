public class Dice
{
    
  private int value;
  Die6 Die1 = new Die6();
  Die6 Die2 = new Die6();

  public Dice() {
    roll();
    getValue();
  }

  public int getValue() {
    value = Die1.getValue() + Die2.getValue();
    return value;
  }

  public void roll() {
    Die1.roll();
    Die2.roll();
  }

  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}
