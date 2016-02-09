import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Marina on 09.02.16.
 */
public class Hash {

    public static void main(String[] args){

        Map<String, String> hash = new HashMap<String, String>();
        hash.put("Tired with all these, for restful death I cry", "As, to behold desert a beggar born");
        hash.put("And needy nothing trimm'd in jollity", "And needy nothing trimm'd in jollity");
        hash.put("And guilded honour shamefully misplaced", "And maiden virtue rudely strumpeted");
        hash.put("And right perfection wrongfully disgraced", "And strength by limping sway disabled");
        hash.put("And art made tongue-tied by authority", "And folly doctor-like controlling skill");
        hash.put("And simple truth miscall'd simplicity", "And captive good attending captain ill:");
        hash.put("Tired with all these, from these would I be gone", "Save that, to die, I leave my love alone.");
        for (Map.Entry entry : hash.entrySet())
            System.out.println(" " + entry.getKey() + " "
                    + entry.getValue());
    }

}
/*
только вот не запускается
 */