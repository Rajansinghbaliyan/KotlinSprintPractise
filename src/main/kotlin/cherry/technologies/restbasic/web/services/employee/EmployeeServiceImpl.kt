package cherry.technologies.restbasic.web.services.employee

import cherry.technologies.restbasic.domain.Employee
import cherry.technologies.restbasic.web.repositories.employee.EmployeeRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository):EmployeeService {
    override fun getAllEmployees(): List<Employee> = employeeRepository.findAll()

    override fun getById(id: UUID): Employee = employeeRepository.getById(id)

    override fun save(employee: Employee): Employee = employeeRepository.save(employee.copy(id = null))

    override fun update(employee: Employee): Employee = employeeRepository.save(employee)

    override fun delete(id: UUID) = employeeRepository.deleteById(id)
}