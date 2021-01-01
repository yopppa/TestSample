package dev.tageda.example.testsample

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun sum() {
        val calc = Calculator()

        // calc.sum(1, 2)は3となることを確認する
        assertThat(calc.sum(1, 2)).isEqualTo(3)
    }

    @Test
    fun isEvenNumber() {
        val calc = Calculator()

        assertThat(calc.isEvenNumber(12)).isTrue()
    }

    @Test
    fun message() {
        val calc = Calculator()

        assertThat(calc.message()).apply {
            isNotEmpty()
            startsWith("me")
            contains("ssa")
            endsWith("ge")
        }
    }
}