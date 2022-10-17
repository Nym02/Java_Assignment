// 2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

package string_manipulation;

public class DiscountedShirtPrice {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";

        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String price[] = str.split("\\s");
        Double shirtPrice = Double.parseDouble(price[0]);
        Double shareePrice = Double.parseDouble(price[1]);
        Double shirtQty = Double.parseDouble(price[2]);
        Double shareeQty = Double.parseDouble(price[3]);
        Double discountedPrice = Double.parseDouble(price[4]);

        Double totalCost = (shirtPrice * shirtQty) + (shareePrice * shareeQty);
        Double disCountedTotalCost = totalCost - discountedPrice;
        System.out.println("Total Cost: " + disCountedTotalCost);
    }
}
