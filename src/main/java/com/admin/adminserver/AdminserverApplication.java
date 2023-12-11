package com.admin.adminserver;

import com.admin.adminserver.security.SecurityConfig;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAdminServer
@Import(SecurityConfig.class)
public class AdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminserverApplication.class, args);
	}

}
