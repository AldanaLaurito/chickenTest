package com.chickentest.chicken.service;

import com.chickentest.chicken.model.Chicken;
import com.chickentest.chicken.service.interfaces.IChickenService;

import java.util.List;

public class ChickenService implements IChickenService {
    @Override
    public List<Chicken> getChickens() {
        return null;
    }

    @Override
    public Chicken getChicken(Long id) {
        return null;
    }

    @Override
    public boolean saveChicken(Chicken chicken) {
        return false;
    }

    @Override
    public boolean updateChicken(Chicken chicken) {
        return false;
    }

    @Override
    public boolean deleteChicken(Chicken chicken) {
        return false;
    }

    @Override
    public boolean deleteChicken(Long id) {
        return false;
    }
}
