public class Loan {
    double principal;
    double rate;
    double year;
    int number;
    public Loan(double p, double r, double y, int n) {
        this.principal = p;
        this.rate = r;
        this.year = y;
        this.number = n;
    }
    double calculateSimpleInterest () {
        return principal * (rate/100.0) * year;
    }
    double calculateTotalRepayment () {
        return principal * Math.pow((1 + (rate/100.0)/number), (number*year));
    }
}