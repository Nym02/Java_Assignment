// 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package string_manipulation;

public class HPLaptopDiscount {
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";

        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String price[] = str.split("\\s");
        Double laptopPrice = Double.parseDouble(price[1]);
        Double discount = Double.parseDouble(price[2]);

        Double discountedPrice = laptopPrice * (discount/100);
        Double totalPrice = laptopPrice - discountedPrice;
        System.out.println("Laptop price after discount: " + totalPrice);
    }
}
