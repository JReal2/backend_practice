package com.fastcampus.fcboard.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.fastcampus.fcboard.domain.ArticleComment}
 */
public record ArticleCommentDto(LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy,
                                String content) implements Serializable {

    public static ArticleCommentDto of(LocalDateTime createdAt, String createdBy,
                                       LocalDateTime modifiedAt, String modifiedBy, String content) {
        return new ArticleCommentDto(createdAt, createdBy, modifiedAt, modifiedBy, content);
    }
}