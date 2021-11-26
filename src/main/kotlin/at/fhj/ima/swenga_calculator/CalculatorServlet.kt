package at.fhj.ima.calculator


import at.fhj.ima.swenga_calculator.entity.Calculator
import java.lang.NumberFormatException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "calc", value = ["/calc"])
class CalculatorServlet : HttpServlet(){
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        doPost(req,resp)
    }

    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        try {
            val a = req.getParameter("arg1")!!.toFloat()
            val b = req.getParameter("arg2")!!.toFloat()
            val result = Calculator().add(a,b)
            req.setAttribute("result", result)
            servletContext.getRequestDispatcher("/showResult.jsp").forward(req, resp)
        } catch (npe: NullPointerException){
            resp.status = 400
            req.setAttribute("error","Please make sure that parameters 'arg1' and 'arg2' are in the request!")
            servletContext.getRequestDispatcher("/showError.jsp").forward(req, resp)
        } catch (nfe: NumberFormatException) {
            resp.status = 400
            req.setAttribute("error","Please make sure that parameters 'arg1' and 'arg2' are valid numbers!")
            servletContext.getRequestDispatcher("/showError.jsp").forward(req, resp)
        }
    }
}