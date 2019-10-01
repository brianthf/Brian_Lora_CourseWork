package com.trilogyed.gamestore.dao;

import com.trilogyed.gamestore.model.Game;

import java.util.List;

/*Task:
 *
 */
public interface GameDao {
    Game addGame(Game game);
    Game getGameByTitle(String title);
    Game getGameById(int id);

    List<Game> getAllGames();
    List<Game> getGamesByStudio(String studio);
    List<Game> getGamesByRating(String esrbRating);

    void updateGameInventory(int id, int quantity);
    void updateGame(Game game);
    void deleteGame(int id);
}
