package iis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Dollar d = new Dollar(5);
        //Dollar p = d.times(2); // new object for the product 
        System.out.println( "Hello World inside container!" );
        Bank bank = new Bank();
        System.out.println(bank.reduce(Money.dollar(5), "CHF"));
        // Can not use after the "amount" is made private
        //System.out.printf( "Final Amount %d\n", p.amount );
    }
}
