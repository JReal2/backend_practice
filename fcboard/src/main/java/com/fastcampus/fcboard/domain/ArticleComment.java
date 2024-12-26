package com.fastcampus.fcboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long article_id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
