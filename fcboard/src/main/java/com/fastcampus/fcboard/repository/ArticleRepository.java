package com.fastcampus.fcboard.repository;

import com.fastcampus.fcboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
