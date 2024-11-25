package org.northcoders.model;

public record Book(
        String id,
        String title,
        String genre,
        String description,
        String isbn)
{}
