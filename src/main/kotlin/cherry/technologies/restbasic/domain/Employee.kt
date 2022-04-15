package cherry.technologies.restbasic.domain

import java.sql.Timestamp
import java.util.*

data class Employee(
        override val id: UUID?,
        override val version:Int,
        override val createdAt:Timestamp,
        override val lastModifiedAt:Timestamp,
        val firstName:String,
        val lastName:String,
        val location:String ): Base(id, version, createdAt, lastModifiedAt)