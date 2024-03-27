package pl.blog.readarticleretriever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderArticleRetrieverFacadeTest {

    @Test
    public void f() {
        // given
        ReaderArticleRetrieverFacade readerArticleRetrieverFacade = new ReaderArticleRetrieverFacade();

        // when
        ArticleDto articleDto = readerArticleRetrieverFacade.retrieveById(1L);

        // then
    }

}