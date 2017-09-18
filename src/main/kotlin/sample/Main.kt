package sample

import yunas.Context
import yunas.Yunas


// Entry point
fun main(args: Array<String>) {

    // Top Page (Return html with Thymeleaf)
    Yunas.get("/", homeIndex)

    // RestFul API (Return JSON)
    Yunas.Rest.get("/api", apiTest)

}