/**
 * Created by Sveta on 10/30/14.
 */
public class Fraction
{
    private int num;
    private int denom;

    public int getNum()
    {
        return num;
    }

    public int getDenom()
    {
        return denom;
    }

    public void setNum(int num)
    {
        this.num = num;
    }
    public void setDenom(int denom)
    {
        this.denom = denom;
    }

    public static Fraction product(Fraction a, Fraction b)
    {
        Fraction prod = new Fraction();
        prod.num = a.num * b.num;
        prod.setDenom(a.denom * b.denom);
        return prod;
    }
}