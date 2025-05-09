package com.fastcampus.fcboard.service;

import com.fastcampus.fcboard.domain.Article;
import com.fastcampus.fcboard.domain.ArticleComment;
import com.fastcampus.fcboard.dto.ArticleCommentDto;
import com.fastcampus.fcboard.repository.ArticleCommentRepository;
import com.fastcampus.fcboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.Matchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.never;

@DisplayName("비즈니스 로직 - 게시글 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks private ArticleCommentService sut;

    @Mock private ArticleCommentRepository articleCommentRepository;
    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글 ID 조회하면 해당하는 댓글 리스트 반환")
    @Test
    void givenArticleId_whenSearchingComments_thenReturnsArticleComments() {
        // Given
        Long articleId = 1L;

        given(articleRepository.findById(1L)).willReturn(Optional.of(
                Article.of("title", "content", "#java")
        ));

        // When
        List<ArticleComment> articleComments = sut.searchArticleComments();

        // Then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }

    // TODO  댓글 입력, 수정, 삭제 테스트 추후 추가
}
