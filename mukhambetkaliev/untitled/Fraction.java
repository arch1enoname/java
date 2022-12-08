package com.mukhambetkaliev.untitled;

public class Fraction extends Number{
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator < 1) throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sumFraction(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            return new Fraction(this.numerator + fraction.numerator, this.denominator);
        } else {
            return new Fraction(this.numerator * fraction.denominator + fraction.numerator * this.denominator, this.denominator * fraction.denominator);
        }
    }

    public Fraction difFraction(Fraction fraction) {
        if (this.denominator == fraction.denominator) {
            return new Fraction(this.numerator - fraction.numerator, this.denominator);
        } else {
            return new Fraction(this.numerator * fraction.denominator - fraction.numerator * this.denominator, this.denominator * fraction.denominator);
        }

    }

    public Fraction multiFraction(Fraction fraction){
        return new Fraction(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
    }

    public Fraction divFraction(Fraction fraction) {
        return calibrationFraction(new Fraction(this.numerator * fraction.denominator, this.denominator * fraction.numerator));
    }

    public Fraction sumFraction(int x) {
        return new Fraction(x*this.denominator + this.numerator, this.denominator);
    }

    public Fraction difFraction(int x) {
        return new Fraction(this.numerator - x*this.denominator, this.denominator);
    }

    public Fraction multiFraction(int x) {
        return new Fraction(this.numerator * x, this.denominator);
    }

    public Fraction divFraction(int x) {
        return new Fraction(this.numerator / x, this.denominator);
    }

    private Fraction calibrationFraction(Fraction fraction){
        if ((fraction.numerator < 0 && fraction.denominator < 0) || (fraction.numerator > 0 && fraction.denominator < 0)) {
            return new Fraction(-fraction.numerator, -fraction.denominator);
        }
        return new Fraction(fraction.numerator, fraction.denominator);
    }

    public int intValue(){
        return numerator/denominator;
    }
    public long longValue(){
        return numerator/denominator;
    }
    public float floatValue(){
        return (float)numerator / (float)denominator;
    }
    public double doubleValue() {
        return (double) numerator / (double) denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return this.numerator == fraction.numerator && this.denominator == fraction.denominator;
    }

    @Override
    public Fraction clone() {
        return new Fraction(numerator, denominator);
    }

}
