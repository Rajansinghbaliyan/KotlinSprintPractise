package cherry.technologies.restbasic.web.services.employee

import cherry.technologies.restbasic.domain.Employee
import cherry.technologies.restbasic.utils.CustomExceptions.NotFoundException
import cherry.technologies.restbasic.web.repositories.employee.EmployeeRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository):EmployeeService {
    override fun getAllEmployees(): List<Employee> = employeeRepository.findAll()

    override fun getById(id: UUID): Employee = employeeRepository.getById(id)

    override fun save(employee: Employee): Employee = employeeRepository.save(employee.copy(id = null))

    override fun update(employee: Employee): Employee = with(employee) {
        val empFromDb = id?.let { getById(it) } ?: throw NotFoundException("Please provide the correct id.")
        employeeRepository.save(employee.copy(id = empFromDb.id))
    }

    override fun delete(id: UUID) = employeeRepository.deleteById(id)
}