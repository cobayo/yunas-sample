package sample


import yunas.Context
import yunas.Controller
import yunas.ModelAndView
import yunas.Yunas


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // Top Page (Return html with Thymeleaf)
        Yunas.get("/",TopController())
    }

    private class TopController : Controller {

        override fun action(context: Context): Any {
            return ModelAndView(mapOf("message" to "Hello World"),"index")
        }
    }

}

