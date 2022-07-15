package br.unesp.projeto;

import br.unesp.projeto.model.*;
import br.unesp.projeto.service.*;
import br.unesp.projeto.utils.InstanceGenerator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringtutorialApplication  {
    public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}
    
}