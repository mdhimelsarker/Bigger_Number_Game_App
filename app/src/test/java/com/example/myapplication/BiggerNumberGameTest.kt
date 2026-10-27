package com.example.myapplication

import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.random.Random

class BiggerNumberGameTest {

    private fun generatePairOfNumbers(): Pair<Int, Int> {
        val first = Random.nextInt(1, 100)
        var second = Random.nextInt(1, 100)
        while (second == first) {
            second = Random.nextInt(1, 100)
        }
        return Pair(first, second)
    }

    @Test
    fun generatePairOfNumbers_producesDistinctNumbers() {
        repeat(100) {
            val (first, second) = generatePairOfNumbers()
            assertNotEquals("Numbers should be distinct", first, second)
            assertTrue("First number should be between 1 and 99", first in 1..99)
            assertTrue("Second number should be between 1 and 99", second in 1..99)
        }
    }

    @Test
    fun gameScoreCalculation_isCorrect() {
        var score = 0
        val leftNum = 85
        val rightNum = 42

        // Left is bigger, picking left adds a point
        if (leftNum > rightNum) {
            score++
        } else {
            score--
        }
        assertTrue("Score should be 1", score == 1)

        // Picking right when left is bigger deducts a point
        if (rightNum > leftNum) {
            score++
        } else {
            score--
        }
        assertTrue("Score should be 0", score == 0)
    }
}