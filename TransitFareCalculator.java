public class TransitCalculator {
  static final double payPerRide = 2.75;
  static final double sevenUnlimited = 33.00;
  static final double thirtyUnlimited = 127.00;

  int numberOfDays;
  int numberOfRides;
  boolean aged;
  boolean hasDisability;

  public TransitCalculator(int days, int rides, boolean elderly, boolean disabled) {
    days = numberOfDays;
    rides = numberOfRides;
    elderly = aged;
    disabled = hasDisability;
  }
  public double unlimited7Price(int rides, int days) {
    //19 days = 3 passes(7 x 3 = 21), 33 x 3= 99, 99/20 = 4.95
    int numberOfPurchases = days / 7;
    if (days % 7 != 0) {
      numberOfPurchases++;
    }
    if (aged == true && hasDisability == true) {
      double sevenUnlimited1 = sevenUnlimited / 2; 
    }
    else {
      sevenUnlimited1 = sevenUnlimited;
    }
    double priceOfPurchases = sevenUnlimited1 * numberOfPurchases;
    double pricePerRide = priceOfPurchases / rides;

    return pricePerRide;
    
  }
  public double unlimited30(int rides, int days) {
    int numberOfPurchases = days / 30;
    if(days % 30 != 0) {
      numberOfPurchases++;
    }
     if (aged == true && hasDisability == true) {
      double thirtyUnlimited1 = thirtyUnlimited / 2; 
    }
    else {
      thirtyUnlimited1 = thirtyUnlimited;
    }
    double priceOfPurchases = thirtyUnlimited1 * numberOfPurchases;
    double pricePerRide = priceOfPurchases / rides;

    return pricePerRide;
  }
  public double getRidePrices(int rides, int days) {
    double seven = unlimited7Price();
     if (aged == true && hasDisability == true) {
       double perRidePay = payPerRide / 2; 
    }
    else {
       perRidePay = payPerRide;
    }
    double perRidePay;
    double thirty = unlimited30();

    double[] prices = new double[3];
    double[0] = seven;
    double[1] = perRidePay;
    double[2] = thirty;

    System.out.println(prices);
  }
  public void getBestFare(int rides, int days) {
    if (days < 7) {
      System.out.println("You should get the pay-per-ride option at $" + payPerRide + " per ride.");
    } 
   if (days > 6 && days < 30) {
      System.out.println("You should get the 7-day unlimited option at $" + unlimited7Price() + " per ride.");
      else { 
        System.out.prinln("You should get the 30-day unlimited option at $" + unlimited30() + " per ride.");
      }
    }
  }
  public static void main(String[] args) {

  }
}
