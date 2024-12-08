plugins {
    id("org.myorg.site")
}

site {
    outputDir = layout.buildDirectory.file("mysite")
    websiteUrl = "https://gradle.org"
    vcsUrl = "https://github.com/gradle/gradle-site-plugin"
}
