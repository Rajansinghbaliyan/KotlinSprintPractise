package cherry.technologies.restbasic.web.controllers.employee

import cherry.technologies.restbasic.domain.Employee
import cherry.technologies.restbasic.web.services.employee.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/employee")
class EmployeeControllers(val employeeService: EmployeeService) {

    @GetMapping("/")
    fun getAll() = ResponseEntity
            .ok(employeeService.getAllEmployees())

    @GetMapping("/{id}")
    fun getById(@PathVariable id: UUID) = ResponseEntity
            .ok(employeeService.getById(id))

    @PostMapping("/")
    fun save(@RequestBody employee: Employee) = ResponseEntity
            .status(HttpStatus.CREATED)
            .body(employeeService.save(employee))

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:UUID) = ResponseEntity
            .ok()
            .body(employeeService.delete(id))
}