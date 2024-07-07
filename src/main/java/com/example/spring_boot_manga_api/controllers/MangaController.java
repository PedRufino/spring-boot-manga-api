package com.example.spring_boot_manga_api.controllers;

import com.example.spring_boot_manga_api.domain.Manga;
import com.example.spring_boot_manga_api.services.MangaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mangas")
public class MangaController {

    private final MangaService service;

    public MangaController(MangaService service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Manga>> getMangas(){
        List<Manga> mangas = this.service.getMangasFromLibrary();
        return ResponseEntity.ok().body(mangas);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Manga>> getMangasByTitle(@RequestParam("title") String title){
        List<Manga> mangas = this.service.getMangasByTitle(title);
        return ResponseEntity.ok().body(mangas);
    }
}
