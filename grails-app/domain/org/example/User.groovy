package org.example

class User extends SecUser {
    Profile profile

    static hasMany = [ posts: Post, following: User ]

    static constraints = {
        profile(nullable: true, unique: true)
    }
}
