import com.company.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class sortDescTest {
    int[] testArray;
    int[] correctArray;
    Main m;

    @BeforeEach
    void SetUp(){
        testArray = new int[]{2,3,1,6,5,20,7,8,9,11};
        correctArray = new int[]{20,11,9,8,7,6,5,3,2,1};
        m = new Main();
    }

    @Test
    void testWorking(){
        m.sortDesc(testArray);
        assertArrayEquals(correctArray,testArray);
    }

    @Test
    void testSortedArrayWorking(){
        int[] temp = correctArray;
        assertArrayEquals(correctArray,temp);
        m.sortDesc(testArray);
        assertArrayEquals(temp,correctArray);
    }
}
