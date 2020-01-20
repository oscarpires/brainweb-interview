package br.com.brainweb.interview.core.features.hero;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brainweb.interview.model.Hero;
import br.com.brainweb.interview.model.request.CreateHeroRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HeroService {

	private final HeroRepository heroRepository = new HeroRepository();

	@Transactional
	public UUID create(CreateHeroRequest createHeroRequest) {
		return heroRepository.create(new Hero(createHeroRequest, null));
	}
}
