package com.chickentest.farm.service.interfaces;

import com.chickentest.farm.model.Farm;

import java.util.List;

public interface IFarmService {
    public List<Farm> getFarms();

    public Farm getFarm(Long id);

    public boolean saveFarm(Farm farm);

    public boolean updateFarm(Farm farm);

    public boolean deleteFarm(Farm farm);

    public boolean deleteFarm(Long id);
}
