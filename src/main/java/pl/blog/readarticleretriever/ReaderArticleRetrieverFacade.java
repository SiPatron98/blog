package pl.blog.readarticleretriever;

public class ReaderArticleRetrieverFacade {

    public ArticleDto retrieveById(Long id) {
        return ArticleDto.builder()
                .id(1L)
                .category("IT")
                .header("Jak zostać programistą")
                .content("5 kroków jak zostać programistą Javy:")
                .build();
    }
}
