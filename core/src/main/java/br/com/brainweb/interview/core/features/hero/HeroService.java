package br.com.brainweb.interview.core.features.hero;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brainweb.interview.model.Hero;
import br.com.brainweb.interview.model.request.CreateHeroRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HeroService {

	private final HeroRepository heroRepository = new HeroRepository();
	// was UUID
	
	@Transactional
	public Integer create(CreateHeroRequest createHeroRequest) {
		Hero hero = Hero.builder().build();
		
		return hero.getId();
		//return heroRepository.create(createHeroRequest);
	}

	public HeroRepository getHeroRepository() {
		return heroRepository;
	}
}
