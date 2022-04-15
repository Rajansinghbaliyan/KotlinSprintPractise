package cherry.technologies.restbasic.web.services.employee

import cherry.technologies.restbasic.domain.Employee
import java.util.*

interface EmployeeService{
    fun getAllEmployees(): List<Employee>
    fun getById(id:UUID): Employee
    fun save(employee: Employee): Employee
    fun update(employee: Employee): Employee
    fun delete(id:UUID)
}