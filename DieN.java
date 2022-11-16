public class DieN
{
  
  private int value;
  private int sides;
  
  public DieN(int number) {
    sides = number;
    roll();
  }

  public int getValue() {
    return value;
  }

  public void roll() {
    value = (int)(Math.random() * sides) + 1;
  }

  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}
