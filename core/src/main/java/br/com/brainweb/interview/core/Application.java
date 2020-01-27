package br.com.brainweb.interview.core;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.datetime.joda.DateTimeParser;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.joda.time.DateTime;

import br.com.brainweb.interview.model.enums.Race;
import br.com.brainweb.interview.model.request.CreateHeroRequest;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		

	}

}
