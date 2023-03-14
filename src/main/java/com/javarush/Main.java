package com.javarush;

import com.javarush.entities.Client;
import com.javarush.entities.Manager;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Client.class);
        configuration.addAnnotatedClass(Manager.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


//        session.get();
//        session.update();
//        session.delete();
//        session.save();

//        System.out.println("#1");
//        Query<Client> query1 = session.createQuery("select (cl) from Client cl", Client.class);
//        List<Client> list = query1.list();
//        for (Client client : list) {
//            System.out.println(client);
//        }
//
//        System.out.println("#2");
//        Query<Long> query2 = session.createQuery("select count(man) from Client man", Long.class);
//        Long singleResult = query2.getSingleResult();
//        System.out.println("Общее количество записей: " + singleResult);

//        System.out.println("#3");
//        Query<Client> query1 = session.createQuery("select (cl) from Client cl where cl.tarif = 'Интернет за 100'", Client.class);
//        List<Client> list = query1.list();
//        for (Client client : list) {
//            System.out.println(client);
//        }

//        System.out.println("#4");
//        Query<Client> query1 = session.createQuery("select (cl) from Client cl where cl.name like 'Всеволод%'", Client.class);
//        List<Client> list = query1.list();
//        for (Client client : list) {
//            System.out.println(client);
//        }


//        System.out.println("#5");
//        Query<Object[]> query = session.createQuery("select upper(cl.name), cl.tarif from Client cl");
//        List<Object[]> list = query.list();
//        for (Object[] objects : list) {
//            System.out.println(Arrays.toString(objects));
//        }

//        System.out.println("#6");
//        Query<Client> query = session.createQuery("select (cl) from Client cl", Client.class);
//        Stream<Client> stream = query.stream();
//
//        List<Client> list = stream.filter((o) -> o.isDeptor)
//                .peek((o) -> o.tarif = Objects.equals(o.tarif, "Лидер") ? "Юр.лицо" : "Физ.лицо")
//                .collect(Collectors.toList());
//
//        for (Client client : list) {
//            System.out.println(client);
//        }

//

//                System.out.println("#1");
//        Query<Client> query1 = session.createQuery("select (cl) from Client cl where cl.manager.id = 105", Client.class);
//        List<Client> list = query1.list();
//        for (Client client : list) {
//            System.out.println(client);
//        }

                System.out.println("#1");
        Query<Client> query1 = session.createQuery("select (cl) from Client cl order by cl.connectionDate desc ", Client.class);
        List<Client> list = query1.list();
        for (Client client : list) {
            System.out.println(client);
        }

    }
}