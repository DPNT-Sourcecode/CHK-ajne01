package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        String[] items = skus.split("");

        Map<String, Integer> itemsCount = new HashMap<>();

        for (String item : items) {
            if (itemsCount.containsKey(item)) {
                Integer value = itemsCount.get(item);
                itemsCount.replace(item, value + 1);
            } else {
                itemsCount.put(item, 1);
            }
        }

        Integer sum = 0;

        for(Map.Entry<String, Integer> entry : itemsCount.entrySet()){
            String key = entry.getKey();
            switch (key){
                case "A" -> ;
                case "B" -> ;
                case "C" -> sum += 15 * itemsCount.get(key);
                case "D" -> sum += 15 * itemsCount.get(key);

            }
        }



        return sum;

    }
}

