package com.etoll.etollhandler;


// import com.etoll.etollhandler.Motorists.MotoristController;

// import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class EtollhandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtollhandlerApplication.class, args);
	}

}
