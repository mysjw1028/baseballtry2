package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;

import site.metacoding.red.service.PlayerSerivce;

import site.metacoding.red.web.dto.CMResponse;


@RequiredArgsConstructor
@Controller
public class PlayerController {
	private final PlayerSerivce playerSerivce;

	@GetMapping("/player")
	public String list(Model model) {
		List<Player> playerList = playerSerivce.목록보기();
		model.addAttribute("playerList", playerList);
		return "player/list";
	}

	@GetMapping("/playerForm")
	public String playerForm(Model model) {
		return "team/saveForm";
	}

	@PostMapping("/player")
	public @ResponseBody CMResponse<?> insert() {
		return new CMResponse<>(1, "선수등록 성공", null);
	}
}
