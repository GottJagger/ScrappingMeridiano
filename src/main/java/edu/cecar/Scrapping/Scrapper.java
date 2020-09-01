/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.Scrapping;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * Clase que scrapea una pagina del sitio web del meridiano.
 *
 * @author oderb
 */
public class Scrapper {

    private void ScrappingPaginaMeridiano(String url) {

        try {

            Document document = Jsoup.connect(url).get();

            String titulo = document.select("h1").text();
            Elements contenido = document.select("div.News-content-description");

        } catch (IOException ex) {
            Logger.getLogger(Scrapper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public static void main(String[] args) {
        String url = "https://elmeridiano.co/noticia/capturado-en-tuchin-tenia-una-cuenta-pendiente-en-sucre";
        new Scrapper().ScrappingPaginaMeridiano(url);

    }
}
