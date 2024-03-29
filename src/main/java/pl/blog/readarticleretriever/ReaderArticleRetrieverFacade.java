package pl.blog.readarticleretriever;

import pl.blog.authorarticlecud.AuthorArticleCudFacade;

import java.util.stream.Collectors;

public class ReaderArticleRetrieverFacade {

    AuthorArticleCudFacade authorArticleCudFacade;

    public ReaderArticleRetrieverFacade(AuthorArticleCudFacade authorArticleCudFacade) {
        this.authorArticleCudFacade = authorArticleCudFacade;
    }

    public ArticleDto retrieveById(Long id) {
        pl.blog.authorarticlecud.ArticleDto foundArticle = authorArticleCudFacade.findAllArticles()
                .stream()
                .filter(articleDto -> articleDto.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(""));
        return ArticleDto.builder()
                .id(foundArticle.id())
                .header(foundArticle.header())
                .build();
    }
}
