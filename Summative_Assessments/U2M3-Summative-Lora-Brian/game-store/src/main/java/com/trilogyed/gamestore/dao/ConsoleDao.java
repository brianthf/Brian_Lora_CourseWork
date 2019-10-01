package com.trilogyed.gamestore.dao;

import com.trilogyed.gamestore.model.Console;

import java.util.List;


public interface ConsoleDao {
    Console addConsole(Console console);
    Console getConsoleById(int id);

    List<Console> getConsolesByManufacturer(String manufacturer);
    List<Console> getAllConsoles();

    void updateConsoleInventory(int id, int quantity);
    void updateConsole(Console console);
    void deleteConsole(int id);
}
