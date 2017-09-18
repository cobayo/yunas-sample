package sample

import org.yunas.Context
import org.yunas.ModelAndView

val homeIndex = fun(context: Context) : ModelAndView {

        return ModelAndView(mapOf("message" to "HelloWorld"),"index")
}