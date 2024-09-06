package com.example.spring_boot_manga_api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Manga {
    public String title;
    public String author;
    public List<String> genre;
    public String image;

    @JsonProperty("publication_year")
    public int publicationYear;
    
    public String publisher;

    @JsonProperty("total_chapters")
    public int totalChapters;
}
