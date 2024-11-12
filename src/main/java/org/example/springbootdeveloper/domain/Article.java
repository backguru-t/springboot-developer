package org.example.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.Builder;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder
    public Article(String title, String name) {
        this.title = title;
        this.content = content;
    }
}
