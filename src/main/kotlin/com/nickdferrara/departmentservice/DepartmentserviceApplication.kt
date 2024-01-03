package com.nickdferrara.departmentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class DepartmentserviceApplication

fun main(args: Array<String>) {
    runApplication<DepartmentserviceApplication>(*args)
}
