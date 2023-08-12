package com.example.application.modulea

import com.example.domain.modulea.ModuleARepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ModuleAUseCase(
    private val moduleARepository: ModuleARepository
) {
    fun list(): List<ModuleAUseCaseReturn> {
        return moduleARepository
            .list()
            .map { ModuleAUseCaseReturn(it.message) }
    }
}

class ModuleAUseCaseReturn(
    val name: String
)
