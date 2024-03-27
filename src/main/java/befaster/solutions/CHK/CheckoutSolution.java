package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        String[] lineParts = skus.split(",");
        Integer sum = 0;
        for(int i = 0; i < lineParts.length; i+=3){
            SKU sku = new SKU(lineParts[i], Integer.parseInt(lineParts[i+1]), lineParts[i+2]);

            sum += calculateItemPrice(sku);
        }

        return 0;

    }

    private Integer calculateItemPrice(SKU sku) {
        String[] splitted = sku.specialOffer().split(" for ");
        Integer qty = splitted[0].substring()
    }

    record SKU(String Item, int price, String specialOffer){}
}

