package com.example.Spring.SpringExp1;


import com.example.Spring.SpringExp1.entity.Address;
import com.example.Spring.SpringExp1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

@SpringBootApplication
public class SpringExp1Application implements CommandLineRunner {
	@Autowired
	Employee emp4;

	public static void main(String[] args) {
		SpringApplication.run(SpringExp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Q2
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		Employee ob = new Employee();
		Address address = new Address();
		System.out.println(">>> INPUT EMPLOYEE DETAILS <<<");
		System.out.print("ID: ");
		ob.setId(Integer.parseInt(br.readLine()));

		System.out.print("Name: ");
		ob.setName(br.readLine());

		System.out.print("City: ");
		address.setCity(br.readLine());

		System.out.print("State: ");
		address.setState(br.readLine());

		System.out.print("Pin: ");
		address.setPin(Long.parseLong(br.readLine()));

		ob.setAddress(address);
		System.out.println(ob);

		//Q4
		System.out.println(emp4);
	}
}




