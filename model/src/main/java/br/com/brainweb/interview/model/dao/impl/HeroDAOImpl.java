package br.com.brainweb.interview.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import br.com.brainweb.interview.model.Hero;


public class HeroDAOImpl {

/*	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public Hero getHeroById(UUID id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		Hero hero = jdbcTemplate.queryForObject("select * from heroes where id = :id", params, new HeroMapper());

		return hero;
	}

	public Hero insert(Hero hero) {
		KeyHolder keyHolder = new GeneratedKeyHolder();

		SqlParameterSource params = new MapSqlParameterSource().addValue("name", hero.getName());

		jdbcTemplate.update("insert into heroes(name) values(:name)", params, keyHolder);

		hero.setId(UUID.randomUUID());

		return hero;
	}

	private class HeroMapper implements RowMapper<Hero> {
		@Override
		public Hero mapRow(ResultSet rs, int rowNum) throws SQLException {
			Hero hero = new Hero();
			hero.setName(rs.getString("name"));
			
			return hero;
		}

	}
*/
}
