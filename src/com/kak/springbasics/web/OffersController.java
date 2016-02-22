package com.kak.springbasics.web;

import com.kak.springbasics.web.dao.Offer;
import com.kak.springbasics.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by akak on 2/15/2016.
 */
@Controller
public class OffersController {

    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping(value = "/showOffers")
    public String showHome (Model model) {

        List<Offer> offers = offersService.getCurrent();

        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping(value = "/createOffer")
    public String createOffer () {

        return "createOffer";
    }

    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public String showTest (Model model, @RequestParam("id")String id) {

        System.out.println ("ID is " +id);
        return "home";
    }
}
