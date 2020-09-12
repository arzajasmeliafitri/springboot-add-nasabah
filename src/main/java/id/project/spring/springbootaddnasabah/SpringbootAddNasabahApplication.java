package id.project.spring.springbootaddnasabah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(
		scanBasePackages = {
				"id.project.spring"
		}
)

@ComponentScan(
		basePackages = {
				"id.project.spring.springbootaddnasabah.controller",
				"id.project.spring.springbootaddnasabah.model",
				"id.project.spring.springbootaddnasabah.repository"
		}
)

@EnableJpaRepositories(
		basePackages = {
				"id.project.spring.springbootaddnasabah.repository"
		}
)
@EntityScan(
		basePackages = {
				"id.project.spring.springbootaddnasabah.model"
		}
)

@EnableSwagger2
public class SpringbootAddNasabahApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAddNasabahApplication.class, args);
	}

}
