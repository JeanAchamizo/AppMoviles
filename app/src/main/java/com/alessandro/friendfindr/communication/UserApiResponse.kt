package com.alessandro.friendfindr.communication

import com.alessandro.friendfindr.models.Person

class UserResponse (
    private var name: UserNameApiResponse,
    private var email: String,
    private var cell: String,
    private var picture: UserPictureApiResponse
) {
    fun toPerson() : Person {
        return Person(
            firstName = name.first,
            lastName = name.last,
            email = email,
            cell = cell,
            picture = picture.large
        )
    }
}

data class UserNameApiResponse (
    var first: String,
    var last: String
)

data class UserPictureApiResponse (
    var large: String,
    var medium: String,
    var thumbnail: String
)