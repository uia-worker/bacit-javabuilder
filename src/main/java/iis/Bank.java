package iis;

class Bank {
    Money reduce(Expression source, String to) {
        //if (source instanceof Money) return (Money) source.reduce(to); // this is ugly
        //Sum sum = (Sum) source; // cast expression to Sum; should work with any Expressions
        //int amount = sum.augend.amount + sum.addend.amount;
        //return new Money(amount, to);
        return source.reduce(to);
    }
}