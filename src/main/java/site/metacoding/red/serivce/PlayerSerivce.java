package site.metacoding.red.serivce;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Service // IoC 등록
public class PlayerSerivce {

	private final PlayerDao playerDao;

	public List<Player> 목록보기() {
		return playerDao.findAll();
	}
}