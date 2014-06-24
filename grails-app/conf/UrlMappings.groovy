class UrlMappings {
    static mappings = {
        "/"(controller: "post", action: "global")
        "/timeline"(controller: "post", action: "timeline")
        "/person/$username?"(controller: "post", action: "personal")
        "/image/$action"(controller: "image")
        "/post/addPostAjax"(controller: "post",action: "addPostAjax")
        "/post/followAjax"(controller: "post",action: "followAjax")

        "/admin/users?"(controller: "user", action: "search")
        "/admin/user/$action"(controller: "user")
        "/admin/roles"(controller: "role", action: "search")
        "/admin/role/$action"(controller: "role")
        "/admin/registrationCode/$action?"(controller: "registrationCode")
        "/admin/info/$action?"(controller: "securityInfo")

        "/login/$action?"(controller: "login")
        "/logout"(controller: "logout")

        "500"(controller: "error", action: "serverError")
        "404"(controller: "error", action: "notFound")
        "403"(controller: "error", action: "forbidden")
    }
}
