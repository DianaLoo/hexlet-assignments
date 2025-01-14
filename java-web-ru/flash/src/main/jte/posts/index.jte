@import exercise.util.NamedRoutes
@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
    page = page,
    content = @`
      <div class="mx-auto p-4 py-md-5">
              <main>
              <h1>Все посты</h1>
              <div class="mb-3">
              <a href="${NamedRoutes.buildPostPath()}">Новый пост</a>
              </div>
                  <div>
                      <ul>
                          @for(var post : page.getPosts())
                              <li>
                                  <a href="${NamedRoutes.postPath(post.getId())}">${post.getName()}</a>
                              </li>
                          @endfor
                      </ul>
                  </div>
              </main>
      </div>
    `
)