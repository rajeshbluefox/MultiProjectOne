package rajesh.app.project1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform