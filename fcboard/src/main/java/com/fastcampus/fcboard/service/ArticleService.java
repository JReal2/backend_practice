package com.fastcampus.fcboard.service;

import com.fastcampus.fcboard.domain.Article;
import com.fastcampus.fcboard.domain.type.SearchType;
import com.fastcampus.fcboard.dto.ArticleDto;
import com.fastcampus.fcboard.dto.ArticleUpdateDto;
import com.fastcampus.fcboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<Article> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable) {
        if (searchKeyword == null || searchKeyword.isBlank()) {
            return Page.empty();
        }
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long articleId) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {

    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {

    }

    public void deleteArticle(long articleId) {
    }
}