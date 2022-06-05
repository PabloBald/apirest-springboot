package com.pablo.webapi.Data.Seed;

import com.pablo.webapi.Data.Repositories.IPeliculaRepository;
import com.pablo.webapi.Domain.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PeliculaDBSeeder implements CommandLineRunner {
    @Autowired
    IPeliculaRepository peliculaRepository;

    @Override
    public void run(String... args) {
        seedPeliculas();
    }

    private void seedPeliculas() {
        if(peliculaRepository.count()==0) {
            Pelicula pelicula1 = new Pelicula();
            pelicula1.setTitulo("Jumanji");
            pelicula1.setPoster("https://m.media-amazon.com/images/I/A1hFzTczzJL._AC_SY879_.jpg");
            pelicula1.setSinopsis("Four teenagers are sucked into a magical video game, and the only way they can escape is to work together to finish the game.");
            pelicula1.setTrailer("https://www.youtube.com/watch?v=leIrosWRbYQ");

            Pelicula pelicula2 = new Pelicula();
            pelicula2.setTitulo("Avatar");
            pelicula2.setPoster("http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg");
            pelicula2.setSinopsis("\"A paraplegic marine dispatched to the moon Pandora on a unique mission becomes" +
                    " torn between following his orders and protecting the world he feels is his home.\"");
            pelicula2.setTrailer("https://www.youtube.com/watch?v=5PSNL1qE6VY");

            Pelicula pelicula3 = new Pelicula();
            pelicula3.setTitulo("The Avengers");
            pelicula3.setPoster("http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg");
            pelicula3.setSinopsis("\"Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous " +
                    "Loki and his alien army from enslaving humanity.\"");
            pelicula3.setTrailer("https://www.youtube.com/watch?v=eOrNdBpGMv8");

            Pelicula pelicula4 = new Pelicula();
            pelicula4.setTitulo("The Wolf of Wall Street");
            pelicula4.setPoster("http://ia.media-imdb.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_SX300.jpg");
            pelicula4.setSinopsis("Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker" +
                    " living the high life to his fall involving crime, corruption and the federal government.");
            pelicula4.setTrailer("https://www.youtube.com/watch?v=iszwuX1AK6A");

            Pelicula pelicula5 = new Pelicula();
            pelicula5.setTitulo("Interstellar");
            pelicula5.setPoster("http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SX300.jpg");
            pelicula5.setSinopsis("A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.");
            pelicula5.setTrailer("https://www.youtube.com/watch?v=zSWdZVtXT7E");

            Pelicula pelicula6 = new Pelicula();
            pelicula6.setTitulo("Doctor Strange");
            pelicula6.setPoster("http://ia.media-imdb.com/images/M/MV5BNjgwNzAzNjk1Nl5BMl5BanBnXkFtZTgwMzQ2NjI1OTE@._V1_SX300.jpg");
            pelicula6.setSinopsis("After his career is destroyed, a brilliant but arrogant and conceited surgeon gets a new lease on" +
                    " life when a sorcerer takes him under her wing and trains him to defend the world against evil.");
            pelicula6.setTrailer("https://www.youtube.com/watch?v=h7gvFravm4A");

            Pelicula pelicula7 = new Pelicula();
            pelicula7.setTitulo("Rogue One: A Star Wars Story");
            pelicula7.setPoster("https://images-na.ssl-images-amazon.com/images/M/MV5BMjQyMzI2OTA3OF5BMl5BanBnXkFtZTgwNDg5NjQ0OTE@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
            pelicula7.setSinopsis("The Rebellion makes a risky move to steal the plans to the Death Star, setting up the epic saga to follow.");
            pelicula7.setTrailer("https://www.youtube.com/watch?v=frdj1zb9sMY");

            Pelicula pelicula8 = new Pelicula();
            pelicula8.setTitulo("Assassin's Creed");
            pelicula8.setPoster("http://ia.media-imdb.com/images/M/MV5BMTU2MTQwMjU1OF5BMl5BanBnXkFtZTgwMDA5NjU5ODE@._V1_SX300.jpg");
            pelicula8.setSinopsis("When Callum Lynch explores the memories of his ancestor Aguilar and gains the skills of a Master Assassin," +
                    " he discovers he is a descendant of the secret Assassins society.");
            pelicula8.setTrailer("https://www.youtube.com/watch?v=4haJD6W136c");

            Pelicula pelicula9 = new Pelicula();
            pelicula9.setTitulo("Luke Cage");
            pelicula9.setPoster("http://ia.media-imdb.com/images/M/MV5BMTcyMzc1MjI5MF5BMl5BanBnXkFtZTgwMzE4ODY2OTE@._V1_SX300.jpg");
            pelicula9.setSinopsis("Given superstrength and durability by a sabotaged experiment, " +
                    "a wrongly accused man escapes prison to become a superhero for hire.");
            pelicula9.setTrailer("https://www.youtube.com/watch?v=ORa4hPhGrpo");

            Pelicula pelicula10 = new Pelicula();
            pelicula10.setTitulo("I Am Legend");
            pelicula10.setPoster("https://m.media-amazon.com/images/I/51PjvlsRHtL._AC_.jpg");
            pelicula10.setSinopsis("Years after a plague kills most of humanity and transforms the rest into monsters, " +
                    "the sole survivor in New York City struggles valiantly to find a cure.");
            pelicula10.setTrailer("https://www.youtube.com/watch?v=dtKMEAXyPkg");

            peliculaRepository.save(pelicula1);
            peliculaRepository.save(pelicula2);
            peliculaRepository.save(pelicula3);
            peliculaRepository.save(pelicula4);
            peliculaRepository.save(pelicula5);
            peliculaRepository.save(pelicula6);
            peliculaRepository.save(pelicula7);
            peliculaRepository.save(pelicula8);
            peliculaRepository.save(pelicula9);
            peliculaRepository.save(pelicula10);

        }
    }
}
