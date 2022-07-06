//FractionMain
//ICS4U1, Dip Tandel
//Nov 1, 2021

public class FractionMain {
  public static void main (String[] args) {
    
    Fraction f1 = new Fraction(3,4); //make f1 = 3/4
    Fraction f2 = new Fraction(); //make f2 = 5/6
    f2.setNum(5);
    f2.setDen(6);
    System.out.println(f1);
    System.out.println(f2);
    
    f1.add(f2); //3/4 + 5/6
    System.out.println(f1); //print result
    f1.multiply(f2); //38/24 * 5/6
    System.out.println(f1); //print result
    f1.divide(f2); //190/144 / 5/6
    System.out.println(f1); //print result
    f1.subtract(f2); //1140/720 - 5/6
    System.out.println(f1); //print result
  }
}