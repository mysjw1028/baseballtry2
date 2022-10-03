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
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.service.TeamSerivce;
import site.metacoding.red.web.dto.CMResponse;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamSerivce teamSerivce;
	private final StadiumService stadiumService;

		@GetMapping("/team")
		public String list(Model model) {
			List<Team> teamList = teamSerivce.목록보기();
			model.addAttribute("teamList",teamList);
			return "team/list";
		}
		
		@GetMapping("/teamForm")
		public String teamForm(Model model) {
			List<Stadium> stadiumList = stadiumService.목록보기();
			model.addAttribute("stadiumList",stadiumList);
			return "team/saveForm";
		}
		@PostMapping("/team")
		public @ResponseBody CMResponse<?>insert(@RequestBody TeamInsertReqDto teamInsertReqDto){
			teamSerivce.팀등록(teamInsertReqDto);
			return new CMResponse<>(1, "팀등록 성공", null);
		}

}
