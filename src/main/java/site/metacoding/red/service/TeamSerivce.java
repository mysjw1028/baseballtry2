package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

@RequiredArgsConstructor
@Service
public class TeamSerivce {

	private final TeamDao teamDao;

	public List<Team> 목록보기() {
		return teamDao.findAll();
	}
	public void 팀등록(TeamInsertReqDto teamInsertReqDto) {
		teamDao.insert(teamInsertReqDto.toEntitly());
	}
}
