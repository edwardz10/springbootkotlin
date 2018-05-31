package com.example.springboot.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
class KotlinSpringJpaPostgresqlApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringJpaPostgresqlApplication::class.java, *args)
}