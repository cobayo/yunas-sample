package sample

import yunas.Context
import yunas.ModelAndView

val homeIndex = fun(context: Context) : ModelAndView {

        return ModelAndView(mapOf("message" to "HelloWorld"),"index")
}