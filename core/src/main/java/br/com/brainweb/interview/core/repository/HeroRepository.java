package br.com.brainweb.interview.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brainweb.interview.model.Hero;

//@RequiredArgsConstructor

public interface HeroRepository extends JpaRepository<Hero, Long> {

	/*
	 * @Autowired private DataSource dataSource;
	 * 
	 * private static final String QUERY_HERO_ALL = " SELECT * FROM Hero ";
	 * 
	 * private static final String CREATE_HERO_QUERY = "INSERT INTO hero" +
	 * " (name, race, power_stats_id)" +
	 * " VALUES (:name, :race, :powerStatsId) RETURNING id";
	 * 
	 * private NamedParameterJdbcTemplate template;
	 * 
	 * @PostConstruct private void postConstruct() { template = new
	 * NamedParameterJdbcTemplate(dataSource); }
	 * 
	 * UUID create(Hero hero) { final Map<String, Object> params = new
	 * HashMap<String, Object>(); params.put("name", hero.getName());
	 * params.put("race", hero.getRace().name()); params.put("powerStatsId",
	 * hero.getPowerStatsId());
	 * 
	 * return template.queryForObject(CREATE_HERO_QUERY, params, UUID.class); }
	 * 
	 * Hero find(UUID id) { final Map<String, Object> params = new HashMap<String,
	 * Object>(); Hero hero = null; params.put("name", hero.getName());
	 * params.put("race", hero.getRace().name()); params.put("powerStatsId",
	 * hero.getPowerStatsId());
	 * 
	 * return template.queryForObject("SELECT * FROM Hero where id = ?", params,
	 * Hero.class);
	 * 
	 * // return NamedParameterJdbcTemplate.CREATE_HERO_QUERY, params, UUID.class);
	 * }
	 * 
	 * Hero findAll() { final Map<String, Object> params = new HashMap<String,
	 * Object>();
	 * 
	 * return template.queryForObject(QUERY_HERO_ALL, params, Hero.class); }
	 */
}
