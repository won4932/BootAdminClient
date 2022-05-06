package com.verification.bootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BootadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootadminApplication.class, args);
		double a = 1234.4567;

		String b = "1234.4567";

		Object c = "1234.4567";

		System.out.println((double)Math.round(a*100)/100);


//		System.out.println((double)Math.round(Double.parseDouble(c.toString())*100)/100);
		System.out.println((double)c);
	}

}
