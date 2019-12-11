package pkg;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControllers {

	@RequestMapping(value = "wc") 
	public String welcomePage()
	{
		//this is view name
		return "welcome";
	}
	@RequestMapping(value = "calciform") 
	public String cf()
	{	
		return "cf";
	}
	@RequestMapping(value = "add") 
	public String addfun(HttpServletRequest request,Model model)
	{	
		String fno = request.getParameter("fno");
		String sno = request.getParameter("sno");
		int answer = Integer.parseInt(fno) + Integer.parseInt(sno);

		model.addAttribute("f", fno);
		model.addAttribute("s", sno);
		model.addAttribute("a", answer);
		
		return "answer";
	}
}










