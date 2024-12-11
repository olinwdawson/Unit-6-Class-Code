package algorithms;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayAlgorithmsTest {

    @Test
    public void testFindMin() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(1, ArrayAlgorithms.findMin(arr));
    }

    @Test
    public void testFindMax() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(9, ArrayAlgorithms.findMax(arr));
    }

    @Test
    public void testFindAverage() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(5.0, ArrayAlgorithms.findAverage(arr), 0.001);
    }

    @Test
    public void testShiftLeft() {
        int[] arr = {5, 2, 8, 1, 9};
        ArrayAlgorithms.shiftLeft(arr);
        assertArrayEquals(new int[]{2, 8, 1, 9, 5}, arr);
    }

    @Test
    public void testReverse() {
        int[] arr = {5, 2, 8, 1, 9};
        ArrayAlgorithms.reverseArray(arr);
        assertArrayEquals(new int[]{9, 1, 8, 2, 5}, arr);
    }
}
