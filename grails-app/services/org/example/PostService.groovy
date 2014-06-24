package org.example

class PostService {
    Post createNewPost(long userId, String postContent) {
        def post = new Post(content: postContent, createdOn: new Date())
        def user = User.get(userId)
        user.addToPosts(post)

        if (user.validate()) {
            // Add tags.
            def m = post.content =~ /#(\w+)/
            if (m) {
                m.each { match ->
                    println "Match: $match, (${match[1]})"
                    def tag = Tag.findByLabel(match[1])
                    if (!tag) tag = new Tag(label: match[1])
                    post.addToTags(tag)
                }
            }
            user.save(flush: true)
        }

        return post
    }
}
