package com.exercicio2.exercicio2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/Hello")


public class Exercicio2Controller {
	@GetMapping
	public String hello ()
	{
		return "Meu objetivo é captar o conteúdo com qualidade";
	}
}
