package org.example

class Tag {
    String label

    static hasMany = [ posts: Post ]
    static belongsTo = Post

    static constraints = {
        label(blank: false)
    }
}
