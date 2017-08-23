package com.jennbowers.bowersportfolio.repositories;

import com.jennbowers.bowersportfolio.interfaces.PortfolioRepository;
import com.jennbowers.bowersportfolio.models.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PortfolioRepositoryImpl implements PortfolioRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Portfolio> findAll() {
        return jdbcTemplate.query("SELECT * FROM bowersportfolio", new PortfolioMapper());
    }

    private static class PortfolioMapper implements RowMapper<Portfolio> {
        @Override
        public Portfolio mapRow(ResultSet resultSet, int i) throws SQLException {
            Portfolio portfolio = new Portfolio(resultSet.getLong("id"),
                    resultSet.getString("photourl1"),
                    resultSet.getString("photourl2"),
                    resultSet.getString("photourl3"),
                    resultSet.getString("photourl4"),
                    resultSet.getString("githubpagesurl"),
                    resultSet.getString("githuburl"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("date"),
                    resultSet.getString("technologiesused"),
                    resultSet.getString("language"));
            return portfolio;
        }
    }
}
