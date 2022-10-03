package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.player.PlayerInsertReqDto;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Service
public class PlayerSerivce {

	private final PlayerDao playerDao;

	public void 선수삭제(Integer id) {
		playerDao.deleteById(id);
	}

	public List<Player> 목록보기() {
		return playerDao.findAll();
	}

	public void 선수등록(PlayerInsertReqDto playerInsertReqDto) {
		playerDao.insert(playerInsertReqDto.toEntity());
	}
}
