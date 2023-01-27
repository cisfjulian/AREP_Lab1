package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL personalSite = new URL( "https://campusvirtual.escuelaing.edu.co/moodle/mod/assign/view.php?id=31610");

        System.out.println(personalSite.getProtocol());

    }
}