package com.example.api.modulea

import com.example.application.modulea.ModuleAUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/module-a")
class ModuleAController(
    private val moduleAUseCase: ModuleAUseCase
) {

    @GetMapping
    fun get(): List<ModuleAView> {
        return moduleAUseCase.list().map { ModuleAView(it.name) }
    }

    class ModuleAView(val name: String)
}
