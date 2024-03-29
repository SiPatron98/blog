package pl.blog.authorarticlecud;

public record ArticleCreateDto(
        String header,
        String content,
        String category
) {
}
