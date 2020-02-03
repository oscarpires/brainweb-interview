package br.com.brainweb.interview.core.features.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brainweb.interview.core.repository.HeroRepository;
import br.com.brainweb.interview.model.Hero;
import br.com.brainweb.interview.model.request.CreateHeroRequest;

@Service
public class HeroService {

	private HeroRepository heroRepository;

	@Autowired
	public void setHeroRepository(HeroRepository heroRepository) {
		this.heroRepository = heroRepository;
	}

	@Transactional
	public long create(CreateHeroRequest createHeroRequest) {
		System.out.println("* create Hero via Build");

		Hero hero = new Hero();

		return hero.getId();
		// return heroRepository.create(createHeroRequest);
	}

	public HeroRepository getHeroRepository() {
		return heroRepository;
	}
}
