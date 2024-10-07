package com.example.makeyourpizza.services;

import com.example.makeyourpizza.beans.PizzaBeans;
import com.example.makeyourpizza.dao.PizzaDAO;

import java.util.ArrayList;
import java.util.List;

public class PizzaService implements PizzaDAO<PizzaBeans> {

    private List<PizzaBeans> pizzas;
    public PizzaService(){
    pizzas = new ArrayList<>();
    }

    //create new pizza line
    @Override
    public boolean create(PizzaBeans o){
        return pizzas.add(o);
    }
    //update
    public boolean update(PizzaBeans o){
        return false;
    }

    //delete a line
    public boolean delete(PizzaBeans o){
        return pizzas.remove(o);
    }

    //find by id
    public PizzaBeans findById(int id){
        for (PizzaBeans p : pizzas){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    @Override
    public List<PizzaBeans> findAll(){
        return pizzas;
    }
}
