package com.example.infrastructure.modulea

import com.example.domain.modulea.ModuleA
import com.example.domain.modulea.ModuleARepository
import org.springframework.jdbc.core.DataClassRowMapper
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class ModuleAJdbcRepository(
    private val jdbcTemplate: NamedParameterJdbcTemplate
) : ModuleARepository {
    override fun list(): List<ModuleA> {
        return jdbcTemplate.query(
            """
                select 
                    message
                from
                    hello
                where
                    type = :type
            """,
            mapOf("type" to "MODULEA"),
            DataClassRowMapper(ModuleA::class.java)
        )
    }
}
