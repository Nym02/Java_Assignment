//4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

package function_array;

import java.util.HashMap;

public class HashmapSoln {
    public void searchItem(String item, HashMap list){
        int count=0;
        for (Object i : list.keySet()) {
            if(i == item){
                count++;
                System.out.println("Price: " + list.get(i));
            }

        }
        if(count == 0){
            System.out.println("No item found.");
        }
    }
    public void totalSum(HashMap list){
        int sum = 0;
        for (Object i : list.keySet()) {
            int itemPrice = (int) list.get(i);
            sum += itemPrice;
        }

        System.out.println("Total sum is: " + sum);
    }
    public static void main(String[] args) {
        HashMap list = new HashMap();
        list.put("rice", 70);
        list.put("beef", 700);
        list.put("mutton", 900);
        list.put("biryani", 400);

        HashmapSoln newHash = new HashmapSoln();
        newHash.searchItem("rice", list);
        newHash.totalSum(list);



    }
}
