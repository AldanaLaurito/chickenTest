package com.chickentest.egg.service;

import com.chickentest.egg.model.Egg;
import com.chickentest.egg.service.interfaces.IEggService;

import java.util.List;

public class EggService implements IEggService {
    @Override
    public List<Egg> getEggs() {
        return null;
    }

    @Override
    public Egg getEgg(Long id) {
        return null;
    }

    @Override
    public boolean saveEgg(Egg egg) {
        return false;
    }

    @Override
    public boolean updateEgg(Egg egg) {
        return false;
    }

    @Override
    public boolean deleteEgg(Egg egg) {
        return false;
    }

    @Override
    public boolean deleteEgg(Long id) {
        return false;
    }
}
