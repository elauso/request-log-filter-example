package net.elau.example.request_log_filter_example.web.controller

import net.elau.example.request_log_filter_example.web.request.CreateCustomerRequest
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController {

    companion object {
        private val log = LoggerFactory.getLogger(CustomerController::class.java)
    }

    @PostMapping
    @ResponseStatus(CREATED)
    fun create(@RequestHeader isCompany: Boolean, @RequestBody createCustomerRequest: CreateCustomerRequest) {
        log.debug("Inside the create customer post...")
    }
}