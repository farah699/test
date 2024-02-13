package org.example;

import entite.Personne;
import services.PersonneService;
import utils.DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Personne p1=new Personne("Test","Ibtihel");
        Personne p2=new Personne("oussema","ayari");

        PersonneService ps=new PersonneService();

        ps.add(p2);
      //  ps.addPst(p1);

        ps.readAll().forEach(System.out::println);

    }
}