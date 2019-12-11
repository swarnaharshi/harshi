package pkg;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import bl.Security;
import bl.TrainingRequest;
import javafx.scene.effect.Blend;

@Controller
public class TRMController {
	
	@RequestMapping(value="/")
	public String welcomeService()
	{
		return "login";
	}
	
	@RequestMapping(value="requestform")
	public String requestFormService()
	{
		return "newrequestform";
	}
	
	
	@RequestMapping(value="showEditForm/{request_id}")
	public String showEditFormService(@PathVariable int request_id,Model model)
	{
		TrainingRequest trainingrequest = new Security().getTrainingRequest(request_id);
		
		
		model.addAttribute("command",trainingrequest);
		
		
		return "training_request_editform";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="saveEdit")
	public String saveEditFormService(@ModelAttribute("trainingrequest") TrainingRequest trainingrequest)
	{
		int ret = new Security().updateTrainingRequest(trainingrequest);
		return "redirect:/dashboard1";
	}
	
	
	
	
	
	
	
	@RequestMapping(value="deleteTrainingRequest/{request_id}")
	public String deleteTrainingRequestService(@PathVariable int request_id)
	{
		new Security().deleteTrainingRequest(request_id);	
		return "redirect:/dashboard1";
	}
	
	@RequestMapping(value="savenewrequest")
	public String savenewrequestService(HttpServletRequest request,Model model)
	{
		String pm_name = request.getParameter("pm_name");
		String vertical = request.getParameter("v_name");
		String tech = request.getParameter("t_name");
		String date = request.getParameter("req_date");
		int apppar = Integer.parseInt(request.getParameter("app_num"));
		String location = request.getParameter("loc_name");
		String type = request.getParameter("trng_type");
		
		
		int ret = new Security().saveNewTrainingRequest(pm_name, vertical, 
				tech, date, apppar, location, type);
		
		 return "redirect:/dashboard1"; 
	}
	
	
	@RequestMapping(value="dashboard1")
	public String loginService(Model model)
	{
		List<TrainingRequest> allrequest = new Security().getAllTrainingRequest();
		model.addAttribute("all",allrequest);
		
		return "dashboard";
	}
	
	
	
	@RequestMapping(value="loginForm")
	public String loginService(HttpServletRequest request,Model model)
	{
		System.out.println("---------ok");
		
		String username  = request.getParameter("username");
		String userpassword = request.getParameter("userpassword");
		
		boolean result = new Security().isUserValid(username, userpassword);
		
		if(result)
		{
			List<TrainingRequest> allrequest = new Security().getAllTrainingRequest();
			model.addAttribute("all",allrequest);
			
			return "dashboard";
		}
		else
		{
			model.addAttribute("errmsg", "Wrong user id or password.");
			return "login";
		}	
	}
	
	
}





