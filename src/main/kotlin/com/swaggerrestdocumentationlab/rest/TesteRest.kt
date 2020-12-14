package com.swaggerrestdocumentationlab.rest

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import io.swagger.annotations.ApiOperation

@RestController
@RequestMapping("/api/testes")
class TesteRest {

	@ApiOperation(value = "Retorna uma lista de strings", notes = "Endpoint teste")
	@GetMapping()
	fun findSomeStrings(): List<String> {
		return listOf("one", "two", "one")
	}
}