package com.example.spring_boot_manga_api.feign;

import com.example.spring_boot_manga_api.domain.Manga;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "manga-api", url = "https://mangas-api.s3.us-east-2.amazonaws.com")
public interface MangaClient {

    @GetMapping("/mangas.json")
    List<Manga> getMangas();

    @GetMapping("/mangas.json")
    List<Manga> getMangasByTitle(@RequestParam("title") String title);
}
