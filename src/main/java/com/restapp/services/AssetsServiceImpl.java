package com.restapp.services;

import com.restapp.models.Assets;
import com.restapp.repositories.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsServiceImpl implements AssetsService {


    private final AssetsRepository assetsRepository;

    @Autowired
    public AssetsServiceImpl(AssetsRepository assetsRepository) {
        this.assetsRepository = assetsRepository;
    }

    @Override
    public void save(Assets assets) {
        assetsRepository.save(assets);
    }

    @Override
    public List<Assets> getAllAssets() {
        return assetsRepository.findAll();
    }
}
