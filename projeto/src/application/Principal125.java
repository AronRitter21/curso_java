package application;

import java.time.LocalDate;

import entities.Coment;
import entities.Post;

public class Principal125 {
    public static void main(String[] args) {
        LocalDate moment = LocalDate.of(2018, 06, 21);

        Coment c1 = new Coment("Have a such nice trip bro!");
        Coment c2 = new Coment("OMG thats fucking amazing!");
        Post post1 = new Post(moment, "Traveling to New Zealand", "bla bla bla bla", 20);
        post1.addComent(c1);
        post1.addComent(c2);
        System.out.println(post1.toString());

        c1 = new Coment("Havee a such nice trip bro!");
        c2 = new Coment("OMGG thats fucking amazing!");
        Post post2 = new Post(moment, "Travelingg to New Zealand", "bla bla bla bla", 20);
        post2.addComent(c1);
        post2.addComent(c2);
        System.out.println(post2.toString());
    }
}
