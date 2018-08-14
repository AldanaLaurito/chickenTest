package com.chickentest.chicken.service.interfaces;

import com.chickentest.chicken.model.Chicken;

import java.util.List;

public interface IChickenService {
    public List<Chicken> getChickens();

    public Chicken getChicken(Long id);

    public boolean saveChicken(Chicken chicken);

    public boolean updateChicken(Chicken chicken);

    public boolean deleteChicken(Chicken chicken);

    public boolean deleteChicken(Long id);
}
