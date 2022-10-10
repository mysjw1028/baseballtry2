package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.serivce.StadiumSerivce;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.stadium.StadiumInsertReqDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
		
	private final StadiumSerivce stadiumSerivce;
	
	@GetMapping({"/","/stadium"})
	public String list(Model model) {
		List<Stadium> stadiumList = stadiumSerivce.목록보기();
		model.addAttribute("stadiumList",stadiumList);
		return "stadium/list";
	}
	
	@GetMapping("/stadiumForm")
	public String stadiumForm() {
		return "stadium/saveForm";
	}
	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> insert(@RequestBody StadiumInsertReqDto stadiumInsertReqDto) {
		stadiumSerivce.경기장등록(stadiumInsertReqDto);
		return new CMRespDto<>(1, "경기장 등록 성공", null);
	}
}
