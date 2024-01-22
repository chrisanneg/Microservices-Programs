package com.example.firstspringbootapp;

import com.example.firstspringbootapp.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//if you're reading this you are stupid
@SpringBootApplication
public class FirstspringbootappApplication {//FirstspringbootappApplication implements CommandLineRunner
	@Autowired
	employee ob1;
	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootappApplication.class, args);
	}



	/*@Override
	public void run(String... args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		employee ob = new employee();
		address address = new address();
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
		address.setPin(br.readLine());

		ob.setAddress(address);
		System.out.println(ob);

		// MSA-E1-Q4
		//System.out.println(ob1);

		//System.out.println(ob1.getAddress());
	}*/
}
