package com.fastcampus.fcboard.service;

import com.fastcampus.fcboard.domain.ArticleComment;
import com.fastcampus.fcboard.repository.ArticleCommentRepository;
import com.fastcampus.fcboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleComment> searchArticleComment() {
        return List.of();
    }
}
