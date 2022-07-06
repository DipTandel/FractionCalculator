//Fraction
//ICS4U1, Dip Tandel
//Nov 1, 2021

public class Fraction {
  //instance variables
  private int num;
  private int den;
  //constructors
  public Fraction() {
    num = 0;
    den = 1;
  }
  public Fraction(int newNum, int newDen) {
    num = newNum;
    den = newDen;
  }
  //getters
  public int getNum() {
    return num;
  }
  public int getDen() {
    return den;
  }
  public String toString() {
    return num + "/" + den;
  }
  //setters
  public void setNum(int newNum) {
    num = newNum;
  }
  public void setDen(int newDen) {
    den = newDen;
  }
  public void reciprocal(Fraction f) {
    num = f.getDen();
    den = f.getNum();
  }
  public void add(Fraction f) {
    int tempDen = den;
    den = den * f.getDen();
    num = num * f.getDen() + f.getNum() * tempDen;
  }
  public void subtract(Fraction f) {
    int tempDen = den;
    den = den * f.getDen();
    num = num * f.getDen() - f.getNum() * tempDen;
  }
  public void multiply(Fraction f) {
    num = num * f.getNum();
    den = den * f.getDen();
  }
  public void divide(Fraction f) {
    num = num * f.getDen();
    den = den * f.getNum();
  }
}