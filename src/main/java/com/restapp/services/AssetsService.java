package com.restapp.services;

import com.restapp.models.Assets;

import java.util.List;

public interface AssetsService {
    void save(Assets assetsDto);
    List<Assets> getAllAssets();
}
