package net.pet.food.review.foodreviewbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodReviewBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodReviewBackendApplication.class, args);
		String dbUrl = System.getenv("JDBC_DATABASE_URL");
		String username = System.getenv("JDBC_DATABASE_USERNAME");
		String password = System.getenv("JDBC_DATABASE_PASSWORD");
		System.out.println(dbUrl+" "+username+" "+password);
	}
}
