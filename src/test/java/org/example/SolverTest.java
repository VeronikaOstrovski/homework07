package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @ParameterizedTest
    @ValueSource(ints = {30, 50, 65})
    public void insuranceCoast100(int param) {
        Insurance08 coast = new Insurance08();
        int result100 = coast.insurance100(param);
        assertTrue(result100==100);
    }


    @ParameterizedTest
    @ValueSource(ints = {18, 22, 29})
    public void insuranceCoast120(int param) {
        Insurance08 coast = new Insurance08();
        int result120 = coast.insurance120(param);
        assertTrue(result120 == 120);
    }

    @ParameterizedTest
    @ValueSource(ints = {66, 72, 79})
    public void insuranceCoast130(int param) {
        Insurance08 coast = new Insurance08();
        int result130 = coast.insurance130(param);
        assertTrue(result130 == 130);
    }

    @ParameterizedTest
    @ValueSource(ints = {29, 66, 17, 30, 65, 80})
    public void insuranceCoast0(int param) {
        Insurance08 coast = new Insurance08();
        int result100 = coast.insurance100(param);
        int result120 = coast.insurance120(param);
        int result130 = coast.insurance130(param);
        int result0 = coast.insurance0(param);
        assertTrue(result0 == 0);
        assertTrue(result100 == 0);
        assertTrue(result120 == 0);
        assertTrue(result130 == 0);
    }
    }


