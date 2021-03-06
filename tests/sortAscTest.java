import com.company.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class sortAscTest {

    int[] testArray;
    int[] correctArray;
    Main m;

    @BeforeEach
    void SetUp(){
        testArray = new int[]{2,3,1,6,5,20,7,8,9,11};
        correctArray = new int[]{1,2,3,5,6,7,8,9,11,20};
        m = new Main();
    }

    @Test
    void testNonSortedArrayWorking(){
        m.sortAsc(testArray);
        assertArrayEquals(correctArray,testArray);
    }

    @Test
    void testSortedArrayWorking(){
        int[] temp = correctArray;
        assertArrayEquals(correctArray,temp);
        m.sortAsc(testArray);
        assertArrayEquals(temp,correctArray);
    }
}
