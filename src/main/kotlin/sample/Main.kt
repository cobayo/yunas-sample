package sample


import yunas.Context
import yunas.Controller
import yunas.ModelAndView
import yunas.Yunas


fun main(args: Array<String>) {

        // Top Page (Return html with Thymeleaf)
        Yunas.get("/", object : Controller {
            override fun action(context: Context): Any {
                return ModelAndView(mapOf("message" to "Hello World"),"index")
            }

        })

}



