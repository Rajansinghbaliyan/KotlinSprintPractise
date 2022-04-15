package cherry.technologies.restbasic.web.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler

@org.springframework.web.bind.annotation.ControllerAdvice
class ControllerAdvice {

    @ExceptionHandler(value = [java.lang.Exception::class])
    fun respondError(e: Exception) = ResponseEntity
        .status(HttpStatus.NOT_FOUND)
        .body(e.message)
}