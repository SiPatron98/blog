package pl.blog;

import pl.blog.authorarticlecud.ArticleCreateDto;
import pl.blog.authorarticlecud.ArticleDto;
import pl.blog.authorarticlecud.AuthorArticleCudFacade;
import pl.blog.readarticleretriever.ReaderArticleRetrieverFacade;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // author/admin dodaje wpis
        AuthorArticleCudFacade authorArticleCudFacade = new AuthorArticleCudFacade();
        System.out.println("1. Zapisywanie artykułu przez admina ");
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header1",
                        "content1",
                        "IT"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header2",
                        "content2",
                        "IT2"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header3",
                        "content3",
                        "IT3"
                )
        );
        authorArticleCudFacade.saveArticle(
                new ArticleCreateDto(
                        "header4",
                        "content4",
                        "IT4"
                )
        );
        System.out.println("2. Artykuł zapisany przez admina ");
        // author/admin dodaje wpis
        Set<ArticleDto> allArticles = authorArticleCudFacade.findAllArticles();
        System.out.println("3. Wszystkie wpisy wyswietlone przez admina: ");
        allArticles.forEach(
                System.out::println
        );

        // czytelnik wyswietla wpisy o id 0 oraz 1
        System.out.println("4. Czytelnik wyswietla wpisy o id 0 oraz 1");
        ReaderArticleRetrieverFacade readerArticleRetrieverFacade = new ReaderArticleRetrieverFacade(
                authorArticleCudFacade
        );
        pl.blog.readarticleretriever.ArticleDto articleDto = readerArticleRetrieverFacade.retrieveById(0L);
        System.out.println(articleDto);
        pl.blog.readarticleretriever.ArticleDto articleDto2 = readerArticleRetrieverFacade.retrieveById(1L);
        System.out.println(articleDto2);
    }
}