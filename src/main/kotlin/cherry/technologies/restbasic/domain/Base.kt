package cherry.technologies.restbasic.domain

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.sql.Timestamp
import java.util.*
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Version

abstract class Base(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        @Type(type = "org.hibernate.type.UUIDCharType")
        @Column(length = 36,columnDefinition = "varchar(36)", updatable = false, nullable = false)
        open val id: UUID?,
        @Version
        open val version: Int,
        @CreatedDate
        open val createdAt: Timestamp,
        @LastModifiedDate
        open val lastModifiedAt: Timestamp
)