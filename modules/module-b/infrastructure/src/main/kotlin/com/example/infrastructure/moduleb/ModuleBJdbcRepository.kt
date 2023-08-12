package com.example.infrastructure.moduleb

import com.example.domain.moduleb.ModuleB
import com.example.domain.moduleb.ModuleBRepository
import org.springframework.jdbc.core.DataClassRowMapper
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class ModuleBJdbcRepository(
    private val jdbcTemplate: NamedParameterJdbcTemplate
) : ModuleBRepository {
    override fun list(): List<ModuleB> {
        return jdbcTemplate.query(
            """
                select 
                    message
                from
                    hello
                where
                    type = :type
            """,
            mapOf("type" to "MODULEB"),
            DataClassRowMapper(ModuleB::class.java)
        )
    }
}
