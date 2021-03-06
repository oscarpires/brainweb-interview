package br.com.brainweb.interview.core.features.hero;

import static java.lang.String.format;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.brainweb.interview.core.repository.HeroRepository;
import br.com.brainweb.interview.model.Hero;
import br.com.brainweb.interview.model.request.CreateHeroRequest;

@RestController
@RequestMapping("/heroes")
public class HeroController {

	@Autowired
	private HeroRepository heroRepository;

	@GetMapping
	public List<String> lista(String nomeCurso) {
		List<String> lst = new ArrayList<String>();
		return lst;
	}
 
	@PostMapping(consumes = APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> create(@Validated @RequestBody CreateHeroRequest createHeroRequest) {
		Hero hero = new Hero();
		hero.setCreate_at(createHeroRequest.getCreated_at());
		hero.setUpdated_at(createHeroRequest.getUpdated_at());
		hero.setName(createHeroRequest.getName());
		hero.setEnabled(true);
		hero.setRace(createHeroRequest.getRace());

		Hero id = heroRepository.save(hero); // .create(createHeroRequest);

		System.out.println("HeroId2 " + id);

		return created(URI.create(format("/api/v1/heroes/%s", id))).build();
	}

//	@GetMapping("/{id}")

	@RequestMapping("/data")
	public String data() {
		// mapped to hostname:port/home/index/
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		return dateFormat.format(date);
	}

	@RequestMapping("/lista")
	public String lista() {
		Gson gson = new Gson();
		List<Hero> optional = heroRepository.findAll();

		return gson.toJson(optional);
	}

}
