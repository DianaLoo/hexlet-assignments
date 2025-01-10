@import exercise.util.NamedRoutes
@import exercise.dto.posts.PostsPage

@param PostsPage page

@template.layout.page(
content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            <div>
                <ul>
                    @for(var post : page.getPosts())
                        <li>
                            <a href="${NamedRoutes.postPath(post.getId())}">${post.getName()}</a>
                        </li>
                    @endfor
                </ul>
            </div>
             <div>
                            @if(page.getPage() != 1)
                                <a href="${NamedRoutes.postsPath() + "?page=" + (page.getPage() - 1)}">Назад</a>
                            @endif
                            ${page.getPage()}
                            @if(!page.getPosts().isEmpty())
                                <a href="${NamedRoutes.postsPath() + "?page=" + (page.getPage() + 1)}">Вперёд</a>
                            @endif
                        </div>
                    </main>
                </div>
`
)