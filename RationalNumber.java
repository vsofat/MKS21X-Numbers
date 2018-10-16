public class RationalNumber extends RealNumber{
    private int x, y;
    
    public int getX() {
        return x;
    }
    public int getRationalValue() {
        return y;
    }
    public void setX(int X) {
        x=X;
    }
    public void setY(int Y) {
        y=Y;
    }
    public double toRatio() {
        return x/y;
        public String toString() {
            return “Real:” getX() + “, Rational:” + getY();
        }
    }
