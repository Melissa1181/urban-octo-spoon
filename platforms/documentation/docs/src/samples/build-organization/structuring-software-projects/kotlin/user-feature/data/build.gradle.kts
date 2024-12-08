// tag::project-type[]
plugins {
    id("com.example.java-library")
}
// end::project-type[]

group = "${group}.user-feature"

dependencies {
    api("com.example.myproduct.model:release")

    implementation("com.fasterxml.jackson.core:jackson-databind")
}
