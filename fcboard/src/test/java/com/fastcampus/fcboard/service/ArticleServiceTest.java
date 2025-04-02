package com.fastcampus.fcboard.service;

import com.fastcampus.fcboard.domain.Article;
import com.fastcampus.fcboard.domain.type.SearchType;
import com.fastcampus.fcboard.dto.ArticleDto;
import com.fastcampus.fcboard.dto.ArticleUpdateDto;
import com.fastcampus.fcboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 게시판")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면 게시글 리스트 반환")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticlesList() {
        // given

        // when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); // 제목, 본문, ID, 닉네임, 해시태그

        // then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면 게시글 반환")
    @Test
    void givenArticleId_whenSearchingArticle_thenReturnsArticle() {
        // given

        // when
        ArticleDto article = sut.searchArticle(1L); // 제목, 본문, ID, 닉네임, 해시태그

        // then
        assertThat(article).isNotNull();
    }

    @DisplayName("게시글의 정보를 입력하면 게시글 생성")
    @Test
    void givenArticleInfo_whenSavingArticle_thenSavesArticle() {
        // given
        ArticleDto dto = ArticleDto.of(LocalDateTime.now(), "JR", "title", "content", "#java");
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // when
        sut.saveArticle(dto);

        // then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글의 정보를 입력하면 게시글 수정")
    @Test
    void givenArticleIdAndModifiedInfo_whenUpdatingArticle_thenUpdatesArticle() {
        // given
        ArticleUpdateDto dto = ArticleUpdateDto.of("title", "content", "#java");
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // when
        sut.updateArticle(1L, dto);

        // then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글의 ID를 입력하면 게시글 삭제")
    @Test
    void givenArticleId_whenDeletingArticle_thenDeletesArticle() {
        // given
        willDoNothing().given(articleRepository).delete(any(Article.class));

        // when
        sut.deleteArticle(1L);

        // then
        then(articleRepository).should().delete(any(Article.class));

    }
}