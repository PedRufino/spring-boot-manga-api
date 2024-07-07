package com.example.spring_boot_manga_api.services;

import com.example.spring_boot_manga_api.domain.Manga;
import com.example.spring_boot_manga_api.feign.MangaClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaService {

    private final MangaClient mangaClient;

    public MangaService(MangaClient client){
        this.mangaClient = client;
    }

    public List<Manga> getMangasFromLibrary(){
        return this.mangaClient.getMangas();
    }

    public List<Manga> getMangasByTitle(String title){
        List<Manga> allMangas = this.mangaClient.getMangas();

        // Filtrar os mangás pelo título
        return allMangas.stream()
                .filter(manga -> manga.title.toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
