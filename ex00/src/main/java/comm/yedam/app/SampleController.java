package comm.yedam.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

//pojo : 상속받을 필요 X
@Controller //-> @Controller 상속해서 @Controller, @Service, @Repository(=dao)
@RequestMapping("/sample/*")		//sample로 시작하는 모든 경로는 Samplecontroller으로 처리
@Log
public class SampleController {
	
	@RequestMapping("/ex09")
	@ResponseBody		//자바객체 -> json 구조를 스트링으로 변환
	public SampleVO ex07(SampleVO sample) {
		//SampleVO sample = new SampleVO();
		sample.setName("키티");
		sample.setAge(83);
		return sample;
	}
	
	@RequestMapping("/ex06/{name}/{age}")
	public void ex06(@PathVariable String name,
					@PathVariable int age) {
		log.info("name="+ name);
		log.info("age="+ age);
	}
	
	@RequestMapping("/ex05")			
	public void ex05(SampleVoList list) {
		log.info(list.toString());
		
	}
	
	@RequestMapping("/ex04")
	public void ex04(@RequestParam List<String> ids) {				//배열도 가능. 리스트랑 같음
		//String[] ids = request.getParameterValues("ids");
		log.info(ids.toString());
	}
	
	@RequestMapping("/ex03")
	public void ex03(@RequestParam String[] ids) {				//배열도 가능
		//String[] ids = request.getParameterValues("ids");
		log.info(Arrays.toString(ids));
	}
	
	@GetMapping("/ex02")
	public void ex02(@RequestParam(name = "username") String name,
					 @RequestParam(required = false, defaultValue = "10") int age
					 ) {
		//String name = request.getParameter("name")
		log.info("name="+name);
		log.info("age="+age);
	}
	
	@GetMapping("/ex01")
	public String ex01(@ModelAttribute("sam") SampleVO vo,
						Model model) {		//dto = vo = do, @modelattribute로 이름 변경 가능. 원래 SampleVO vo,~만 써줌
		log.info(vo.toString());
		//model.addAttribute("sam", vo);
		model.addAttribute("pageNo", "10");
		return "sample/ex01";
	}
	
	//@RequestMapping(value="/a", method = RequestMethod.POST)		//경로가 /sample/a면 이거 실행
	@GetMapping("/a")
	public String basic1() {
		log.info("basic1........");
		return "sample/basica";		//jsp 뷰페이지
	}
	
	@RequestMapping("/b")		// /sample/b면 이거 실행
	public void basic2() {					//void인 경우 url과 일치하는 뷰페이지로 포워드
		log.info("basic2........");
	}
}
