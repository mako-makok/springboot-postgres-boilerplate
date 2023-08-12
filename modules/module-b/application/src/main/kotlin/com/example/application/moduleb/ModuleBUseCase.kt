package com.example.application.moduleb

import com.example.domain.moduleb.ModuleBRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class ModuleBUseCase(
    private val moduleBRepository: ModuleBRepository
) {
    fun list(): List<ModuleBUseCaseReturn> {
        return moduleBRepository
            .list()
            .map { ModuleBUseCaseReturn(it.message) }
    }
}

class ModuleBUseCaseReturn(
    val name: String
)
