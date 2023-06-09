package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2, 5, 5},
                {1, 2, 10},
                {2, -1, 3},
                {1, -3, 4}
        });
    }

    @Test
    public void testNoRootsCase() {
        assertEquals("no roots", quadraticEquation.solve(a, b, c));
    }

}
