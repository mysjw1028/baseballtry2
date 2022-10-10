package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.serivce.PlayerSerivce;
import site.metacoding.red.serivce.TeamSerivce;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.player.PlayerInsertReqDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	private final PlayerSerivce playerSerivce;
	private final TeamSerivce teamSerivce;

	@GetMapping("/player")
	public String list(Model model) {
		List<Player> playerList = playerSerivce.목록보기();
		model.addAttribute("playerList", playerList);
		return "player/list";
	}
	

	@GetMapping("/playerForm")
	public String playerForm(Model model) {
		List<Team> teamList = teamSerivce.목록보기();
		model.addAttribute("teamList", teamList);
		return "player/saveForm";
	}
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> insert(@RequestBody PlayerInsertReqDto playerInsertReqDto) {
		playerSerivce.선수등록(playerInsertReqDto);
		return new CMRespDto<>(1, "선수등록 성공", null);
	}

}
