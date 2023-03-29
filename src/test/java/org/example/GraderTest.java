package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF () {
        var Grader = new Grader ();
        assertEquals('F', Grader.determineLetterGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD () {
        var Grader = new Grader ();
        assertEquals('D', Grader.determineLetterGrade(69));
    }
    @Test
    void seventyNineShouldReturnC () {
        var Grader = new Grader ();
        assertEquals('C', Grader.determineLetterGrade(79));
    }
    @Test
    void eightyNineShouldReturnB () {
        var Grader = new Grader ();
        assertEquals('B', Grader.determineLetterGrade(89));
    }
    @Test
    void ninetyNineShouldReturnA () {
        var Grader = new Grader ();
        assertEquals('A', Grader.determineLetterGrade(99));
    }
    @Test
    void eightyShouldReturnB () {
        var Grader = new Grader ();
        assertEquals('B', Grader.determineLetterGrade(80));
    }
    @Test
    void ninetyShouldReturnA () {
        var Grader = new Grader ();
        assertEquals('A', Grader.determineLetterGrade(90));
    }
    @Test
    void seventyShouldReturnC () {
        var Grader = new Grader ();
        assertEquals('C', Grader.determineLetterGrade(70));
    }
    @Test
    void sixtyShouldReturnD () {
        var Grader = new Grader ();
        assertEquals('D', Grader.determineLetterGrade(60));
    }
    @Test
    void zeroShouldReturnF () {
        var Grader = new Grader ();
        assertEquals('F', Grader.determineLetterGrade(0));
    }
    @Test
    void negativeOneShouldReturnIllegalArgumentException () {
        var Grader = new Grader ();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Grader.determineLetterGrade(-1);
                });

    }
}