package iis;

class Money implements Expression {
    protected int amount;
    protected String currency;
    
    Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    // This type of static methods are called "factories"
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    // Another "factory" method
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    String currency() {
        return currency;
    }
    Expression plus(Money addend) {
        //return new Money(amount + addend.amount, currency);
        return new Sum(this, addend);
    }
    public Money reduce(String to) {
        return this;
    }

    // Mocking first just returns "true"
    // So more generic with comparing objects
    // Both assertTrue and assertFalse works
    // Moving from Dollar to Money
    // Trying to cope with subclasses; comparing type of subclass with getvClass
    public boolean equals(Object object) {
        Money money = (Money) object; // casting the type?
        //return amount == money.amount && getClass().equals(money.getClass());
        return amount == money.amount && currency().equals(money.currency());
    }
    // Introduced for better error reporting
    public String toString() {
        return amount + " " + currency;
    }

}