
public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  num
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    reduce();
    if (denominator == 0) {
      denominator = 1;
      numerator = 0;
    }
  }

  public double getValue(){
    return ((double)getNumerator()/getDenominator());//???
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber a = new RationalNumber(denominator,numerator);
    return a;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (numerator == 0){
      return ""+ 0;
    }
    if (denominator == 0){
      return ""+ 0/1;
    }
    else{
      return ""+(numerator)+"/"+(denominator);
    }
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    if (b != 0){
      return gcd(a, a % b);
    }
    else{
      return b;}
    }


    /*
    *Divide the numerator and denominator by the GCD
    *This must be used to maintain that all RationalNumbers are
    *reduced after construction. */


    private void reduce(){
      if (denominator < 0) {
        denominator *= -1;
        numerator *= -1;
      }
      int gcdReduce = gcd(numerator, denominator);
      if (gcdReduce != 0) {
        numerator = numerator / gcdReduce;
        denominator = denominator / gcdReduce;
      }
      }

  /******************Operations!!!!****************/


  /**
 *Return a new RationalNumber that is the product of this and the other
 */
 public RationalNumber multiply(RationalNumber other){
     RationalNumber x = new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
 return x;
 }

 /**
 *Return a new RationalNumber that is the this divided by the other
 */
 public RationalNumber divide(RationalNumber other){
     RationalNumber x = new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
 return x;
 }

 /**
 *Return a new RationalNumber that is the sum of this and the other
 */
 public RationalNumber add(RationalNumber other){
     RationalNumber x = new RationalNumber((this.getNumerator() * other.getDenominator()) + (other.getNumerator() * this.getDenominator()), this.getDenominator() * other.getDenominator());
 return x;
 }
 /**
 *Return a new RationalNumber that this minus the other
 */
 public RationalNumber subtract(RationalNumber other){
     RationalNumber x = new RationalNumber((this.getNumerator() * other.getDenominator()) - (other.getNumerator() * this.getDenominator()), this.getDenominator() * other.getDenominator());
 return x;
 }
} 
