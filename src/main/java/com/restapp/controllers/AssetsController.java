package com.restapp.controllers;



import com.restapp.models.Assets;
import com.restapp.repositories.AssetsRepository;
import com.restapp.services.AssetsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/assets")
public class AssetsController {

    private static final Logger LOGGER = Logger.getLogger(AssetsController.class);

    private final AssetsRepository assetsRepository;
    private final AssetsService assetsService;

    @Autowired
    public AssetsController(AssetsRepository ar, AssetsService assetsService) {
        this.assetsRepository = ar;
        this.assetsService = assetsService;
    }

    @RequestMapping("/get")
    @ResponseBody
    public List<Assets> getAllAssets() {
        LOGGER.info("Retrieving assets...");
        return assetsRepository.findAll();
    }

    @RequestMapping("/post")
    public void saveUser(@RequestBody Assets assets) {
            assetsService.save(assets);
    }

}
