package br.com.pabllo007.hrapigatwarezull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatwareZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatwareZullApplication.class, args);
	}

}
