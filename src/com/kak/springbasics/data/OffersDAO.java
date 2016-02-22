package com.kak.springbasics.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by akak on 2/10/2016.
 */
public class OffersDAO {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource (DataSource ds) {
        this.jdbc = new NamedParameterJdbcTemplate(ds);
        System.out.println ("Got data source");
    }

    public List<Offer> getOffers () {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue ("username", "Lovecraft");

        return jdbc.query("select * from offers where username=:username", params, new RowMapper<Offer>() {
            public Offer mapRow (ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setText(rs.getString("text"));
                offer.setUsername(rs.getString("username"));

                return offer;
            }
        });
    }

    public Offer getOffer (int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue ("id", new Integer(id));

        return jdbc.queryForObject("select * from offers where id=:id", params, new RowMapper<Offer>() {
            public Offer mapRow (ResultSet rs, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(rs.getInt("id"));
                offer.setText(rs.getString("text"));
                offer.setUsername(rs.getString("username"));

                return offer;
            }
        });

    }

    public boolean create (Offer offer) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);

        return jdbc.update("insert into offers (text, username) values(:text, :username)", params) == 1;
    }

    public boolean update (Offer offer) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);

        return jdbc.update("update offers set text=:text, username=:username where id=:id", params) == 1;
    }

    public boolean delete (int id) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue ("id", new Integer(id));

        return jdbc.update("delete from offers where id=:id", params) == 1;
    }

    @Transactional
    public int[] create (List<Offer> offers) {
        SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());

        return jdbc.batchUpdate("insert into offers (text, username) values (:text, :username)", params);
    }

}
