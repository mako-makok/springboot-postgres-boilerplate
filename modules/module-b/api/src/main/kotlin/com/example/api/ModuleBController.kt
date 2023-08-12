package com.example.api

import com.example.application.moduleb.ModuleBUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/module-b")
class ModuleBController(
    private val moduleBUseCase: ModuleBUseCase
) {

    @GetMapping
    fun get(): List<ModuleBView> {
        return moduleBUseCase.list().map { ModuleBView(it.name) }
    }

    class ModuleBView(val name: String)
}
