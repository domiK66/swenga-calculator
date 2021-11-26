package at.fhj.ima.swenga_calculator.enitiy

import at.fhj.ima.swenga_calculator.entity.Calculator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CalculatorTest {
    @Test
    fun testAdd() {
        Assertions.assertEquals(Calculator().add(1F,1F),2F)
    }
}