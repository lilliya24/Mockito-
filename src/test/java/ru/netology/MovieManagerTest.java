package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void testShowMovies() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestShowMoviesIfItsOne() {
        manager.addMoves("Movie I");
        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowMoviesIfItsMoreThenOne() {
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesIfItsAboutALimit() {
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForAboveTheLimit() {
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        manager.addMoves("Film 6");
        manager.addMoves("Film 7");
        manager.addMoves("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForZero() {
        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForOne() {
        manager.addMoves("Film 1");
        String[] expected = {"Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForMoreThanOne() {
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastForALimit() {
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}