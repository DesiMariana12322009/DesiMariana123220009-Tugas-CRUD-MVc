/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;
/**
 *
 * @author Lenovo
 */
    public interface databukuimplement {
    public void insert(databuku b);
    public void update(databuku b);
    public void delete(int id);
    public List<databuku> getAll();

    public List<String> getGenre();

    public List<databuku> getBookByGenre(String genre);

    public List<databuku> search(String by, String text);
}

