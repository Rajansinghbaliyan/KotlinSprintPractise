package cherry.technologies.restbasic.web.repositories.employee

import cherry.technologies.restbasic.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EmployeeRepository: JpaRepository<Employee,UUID>