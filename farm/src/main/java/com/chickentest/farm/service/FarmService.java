package com.chickentest.farm.service;

import com.chickentest.farm.model.Farm;
import com.chickentest.farm.service.interfaces.IFarmService;

import java.util.List;

public class FarmService implements IFarmService {

    @Override
    public List<Farm> getFarms() {
        return null;
    }

    @Override
    public Farm getFarm(Long id) {
        return null;
    }

    @Override
    public boolean saveFarm(Farm farm) {
        return false;
    }

    @Override
    public boolean updateFarm(Farm farm) {
        return false;
    }

    @Override
    public boolean deleteFarm(Farm farm) {
        return false;
    }

    @Override
    public boolean deleteFarm(Long id) {
        return false;
    }
}
