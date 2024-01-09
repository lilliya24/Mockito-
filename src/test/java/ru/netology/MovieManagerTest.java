package ru.netology;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void testWithoutMovies() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithFourMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");


        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastForALimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindTheLastMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
        @Test
        public void testFindLastForAboveTheLimit() {
            MovieManager manager = new MovieManager();
            manager.addMovie("Film 1");
            manager.addMovie("Film 2");
            manager.addMovie("Film 3");
            manager.addMovie("Film 4");
            manager.addMovie("Film 5");
            manager.addMovie("Film 6");
            manager.addMovie("Film 7");
            manager.addMovie("Film 8");
            String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
            String[] actual = manager.findLast();
            Assertions.assertArrayEquals(expected, actual);

        }
}