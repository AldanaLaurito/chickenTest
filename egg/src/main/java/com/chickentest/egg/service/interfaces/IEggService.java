package com.chickentest.egg.service.interfaces;

import com.chickentest.egg.model.Egg;

import java.util.List;

public interface IEggService {
    public List<Egg> getEggs();

    public Egg getEgg(Long id);

    public boolean saveEgg(Egg egg);

    public boolean updateEgg(Egg egg);

    public boolean deleteEgg(Egg egg);

    public boolean deleteEgg(Long id);
}
