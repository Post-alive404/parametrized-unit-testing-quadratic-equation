package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a;
    private final double b;
    private final double c;
    private final String expected;

    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2 , 5, -3, "0.5 -3.0"},
                {1, 6, 8, "-2.0 -4.0"},
                {2, -9, 4, "4.0 0.5"},
                {2, -5, 2, "2.0 0.5"}
        });
    }

    @Test
    public void twoRootsCase(){
        String[] expectedRoots = expected.split(" ");
        String actualString = quadraticEquation.solve(a, b, c);
        String[] actualRoots = actualString.split(" ");
        assertEquals(expectedRoots.length, actualRoots.length);
        for (String root : expectedRoots){
            assertTrue(Arrays.asList(actualRoots).contains(root));
        }
    }
}
