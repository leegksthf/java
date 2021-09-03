package comm.yedam.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//@Controller + @ResponseBody
public class AjaxController {

	@RequestMapping("/ex07")
	public SampleVO ex07(SampleVO sample) {
		//SampleVO sample = new SampleVO();
		sample.setName("키티");
		sample.setAge(83);
		return sample;
	}
	
	@RequestMapping("/ex08")
	public List<SampleVO> ex07() {
		List<SampleVO> list = new ArrayList<SampleVO>();	//1.8로 바꿔서 다시해
		list.add(new SampleVO("choi", 10, new Date()));
		list.add(new SampleVO("park", 20, new Date()));
		list.add(new SampleVO("kim", 30, new Date()));
		return list;
	}
}
