package dev.gxsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GxsoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(GxsoftApplication.class, args);

		System.out.println(multiplyTwoInts(5, 10));
	}

	public static int multiplyTwoInts(int x, int y) {
		return x * y;
	}

}
