package com.example.domain.moduleb

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ModuleBTest {

    @Test
    fun hello() {
        val moduleB = ModuleB(message = "Hello, world!")
        assertEquals(ModuleB(message = "Hello, world!"), moduleB)
    }
}
