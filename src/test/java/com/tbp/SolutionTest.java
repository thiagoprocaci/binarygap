package com.tbp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void doBefore() {
        solution = new Solution();
    }


    @Test
    public void testSolution() {
        assertEquals(5, solution.solution(1041));
        assertEquals(0, solution.solution(1));
        assertEquals(0, solution.solution(0));
        assertEquals(2, solution.solution(9));
        assertEquals(4, solution.solution(529));
        assertEquals(1, solution.solution(20));
        assertEquals(0, solution.solution(15));
        assertEquals(3, solution.solution(1111));
        assertEquals(3, solution.solution(561892));
        assertEquals(4, solution.solution(74901729));
        assertEquals(5, solution.solution(1376796946));
    }

    @Test
    public void testSolution2() {
        assertEquals(5, solution.solution2(1041));
        assertEquals(0, solution.solution2(1));
        assertEquals(0, solution.solution2(0));
        assertEquals(2, solution.solution2(9));
        assertEquals(4, solution.solution2(529));
        assertEquals(1, solution.solution2(20));
        assertEquals(0, solution.solution2(15));
        assertEquals(3, solution.solution2(1111));
        assertEquals(3, solution.solution2(561892));
        assertEquals(4, solution.solution2(74901729));
        assertEquals(5, solution.solution2(1376796946));
    }


}
