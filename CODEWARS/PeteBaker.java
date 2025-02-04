import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

// Pete, the baker
public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
      ArrayList<Integer> all_times = new ArrayList<>();

        for(Map.Entry<String,Integer> ingredient : recipe.entrySet()){
            if(available.containsKey(ingredient.getKey())){
                int ingredient_times = available.get(ingredient.getKey()) / ingredient.getValue();
                all_times.add(ingredient_times);
            } 
            else {
                return 0;
            }

            // if(!avaliable.containsKey(ingredient.getKey())) return 0; // mejor
        }

        return Collections.min(all_times);
    }

}


/* much better!
 * import java.util.Map;

public class PeteBaker {
  public static int cakes(Map<String, Integer> requirements, Map<String, Integer> availableResources) {
      int maxSets = Integer.MAX_VALUE;
      for (String key: requirements.keySet()) {
          if (!availableResources.containsKey(key)) return 0;

          maxSets = Integer.min(maxSets, availableResources.get(key) / requirements.get(key));
      }

      return maxSets;
  }
}
 */