
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
    if (deno == 0){
      numerator = 0;
      denominator = 1
    }
    else{
      numerator = nume;
      denominator = deno;
    }
    super(0);//this value is ignored!
  }

  public double getValue(){
    return ((double)nummerator/denominator);//???
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
    return denominator/numerator;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (this.getNumerator == other.getNumerator) && (this.getDenominator == other.getDenominator);
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
      return ""+numerator/denominator;
    }
    ;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int finalVal = 0;
    int Val1 = Math.max(a,b);
    int Val2 = Math.min(a,b);
    while (Val1 % Val2 != 0){
      int switcher == Val2;
      Val1 == Val1 - Val1 % Val2;
      Val2 == switcher;
    }
    return Val2;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

  }



  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
