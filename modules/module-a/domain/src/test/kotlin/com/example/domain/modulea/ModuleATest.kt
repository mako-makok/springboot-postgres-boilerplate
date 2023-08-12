package com.example.domain.modulea

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ModuleATest {

    @Test
    fun hello() {
        val moduleA = ModuleA(message = "Hello, world!")
        assertEquals(ModuleA(message = "Hello, world!"), moduleA)
    }
}
