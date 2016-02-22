package com.kak.springbasics.web.service;

import com.kak.springbasics.web.dao.Offer;
import com.kak.springbasics.web.dao.OffersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by akak on 2/19/2016.
 */
@Service("offersService")
public class OffersService {

    private OffersDAO offersDao;

    public List<Offer> getCurrent () {
        return offersDao.getOffers();
    }

    @Autowired
    private void setOffersDao (OffersDAO offersDao) {
        this.offersDao = offersDao;
    }
}
