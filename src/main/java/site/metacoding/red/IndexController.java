package site.metacoding.red;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/list")
	public String index() {
		return "stadium/list";
	}
	
	@GetMapping("/saveForm")
	public String index2() {
		return "stadium/saveForm";
	}
}
