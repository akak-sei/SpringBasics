package com.kak.springbasics.spel;

import com.kak.springbasics.data.Offer;
import com.kak.springbasics.data.OffersDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akak on 2/9/2016.
 */
public class App {

    public static void main (String[] args) {
        ApplicationContext context;

        filePath ();

        context = new FileSystemXmlApplicationContext("src\\com\\kak\\springbasics\\beans\\beans2.xml");
        Robot robot = (Robot) context.getBean("robot");
        robot.speak();
        System.out.println (robot.getSecretName());
        robot.revealDBCredentials();

        OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");
        System.out.println(offersDao.getOffer(1));
        //System.out.println(offersDao.delete(8));

        //System.out.println (offersDao.create (new Offer ("fix romeo", "capulet")));

        Offer offerToUpdate = new Offer (9, "he lives again", "capulet");
        System.out.println ("Did the update work? " +offersDao.update(offerToUpdate));

        List<Offer> offersToBatchCreate = new ArrayList<Offer>();
        offersToBatchCreate.add (new Offer ("cash for software", "franzkafka"));
        offersToBatchCreate.add (new Offer ("software for cash", "malakai"));

        int[] batchCreateResponse = offersDao.create(offersToBatchCreate);
        for (int i=0; i < batchCreateResponse.length; i++) {
            System.out.println ("Created in batch " +batchCreateResponse[i]);
        }

        try {
            List<Offer> offers = offersDao.getOffers();
            for (Offer offer: offers) {
                System.out.println(offer);
            }
        } catch (DataAccessException e) {
            System.out.println (e.getMessage());
            System.out.println (e.getClass());
        }

        ((FileSystemXmlApplicationContext) context).close();
    }

    public static void filePath () {
        File f = null;
        String v;
        boolean bool = false;

        try{
            f = new File("test.txt");

            v = f.getAbsolutePath();
            System.out.println("File path is " +v);

            bool = f.exists();

            // if file exists
            if(bool) {
                System.out.print("pathname: "+v);
            }
        } catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }

    }

}
