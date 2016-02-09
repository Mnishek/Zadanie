import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Marina on 09.02.16.
 */
public class Array {
        @Test
        public void merlo() {
            ArrayList<String> set1 = new ArrayList<String>();
            set1.add("One");
            set1.add("Two");
            ArrayList<String> set2 = new ArrayList<String>();
            set2.add("One");
            set2.add("Two");
            Assert.assertEquals(set1, set2);
        }


}
