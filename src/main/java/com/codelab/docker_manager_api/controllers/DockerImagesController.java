package com.codelab.docker_manager_api.controllers;

import com.codelab.docker_manager_api.services.DockerService;
import com.github.dockerjava.api.model.Image;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class DockerImagesController {

    private final DockerService dockerService;

    public DockerImagesController(DockerService dockerService){
        this.dockerService = dockerService;
    }

    @GetMapping("")
    public List<Image> listImages(){
        return dockerService.listImages();
    }

    @GetMapping("/filter")
    public List<Image> filterImages(@RequestParam(required = false, defaultValue = "image-") String filterName){
        return dockerService.filterImages(filterName);
    }
}
