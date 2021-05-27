import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<Integer> createList(Integer... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void multipleConditionsTest() {
        List<Time> times = new ArrayList<>(){};
        Time time = new Time(-1, 20, 5);
        times.add(time);
        RuntimeException ex;
        ex= assertThrows(RuntimeException.class, () -> SILab2.function(times));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

    }

    @Test
    public void everyBranchTest(){
        List<Time> times = new ArrayList<>();
        Time time = new Time(22, 11, 38);
        times.add(time);
        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(79898);
        assertEquals(expectedResults, SILab2.function(times));
    }
}