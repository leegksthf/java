package comm.yedam.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.yedam.app.board.domain.EmpMapper;
import lombok.extern.java.Log;

/**
 * Handles requests for the application home page.
 */

@Log
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		//request.setAttribute(속성명,
		model.addAttribute("serverTime", formattedDate);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Member member) {
		log.info(member.toString()); //error>info>warn>debug>trace
		return "redirect:/";
	}
	
	@Autowired EmpMapper dao;
	
	@RequestMapping("/dept")
	public String login(Model model) {
		model.addAttribute("list", dao.getDept());
		return "dept";
	}
}
