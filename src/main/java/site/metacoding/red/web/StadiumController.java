package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.serivce.StadiumSerivce;

@RequiredArgsConstructor
@Controller
public class StadiumController {
		
	private final StadiumSerivce stadiumSerivce;
	
	@GetMapping("/stadium")
	public String list(Model model) {
		List<Stadium> stadiumList = stadiumSerivce.목록보기();
		model.addAttribute("stadiumList",stadiumList);
		return "stadium/list";
	}
}
