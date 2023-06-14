package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolverTest {
    @Test
    public void squareRootParamTestIsNotRoot() {
        Solver08 solver = new Solver08();
        int result = solver.squareRoot(2, 20, 4);
        assertEquals(0, result);

    }
    @Test
    public void squareRootParamTestIsOneRoot() {
        Solver08 solver = new Solver08();
        int result = solver.squareRoot(8, 8, 2);
        assertEquals(1, result);

    }
    @Test
    public void squareRootParamTestIsTwoRoots() {
        Solver08 solver = new Solver08();
        int result = solver.squareRoot(2, 20, 4);
        assertEquals(2, result);

    }
}
