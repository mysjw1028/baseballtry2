package site.metacoding.red.serivce;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;


@RequiredArgsConstructor
@Service//IoC 등록
public class TeamSerivce {
	
		private final TeamDao teamDao;
		
	public List<Team> 목록보기(){
		return teamDao.findAll();
	}
	
}
