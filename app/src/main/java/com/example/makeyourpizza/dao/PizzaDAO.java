package com.example.makeyourpizza.dao;
import java.util.List;

public interface PizzaDAO<T> {
    public abstract boolean create(T o);
    boolean update (T o);
    boolean delete (T o);
    T findById(int id);
    List<T> findAll();
}
