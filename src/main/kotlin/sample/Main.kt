package sample

import org.yunas.Yunas

// Entry point
fun main(args: Array<String>) {

    // Top Page (Return html with Thymeleaf)
    Yunas.get("/", homeIndex)

    // RestFul API (Return JSON)
    Yunas.Rest.get("/api", tests)

}