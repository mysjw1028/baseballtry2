package site.metacoding.red.web.dto.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.team.Team;

@Setter
@Getter
public class PlayerInsertReqDto {
	private String name;
	private Integer teamId;
	private String position;

	
	public Player toEntity() {
		Player player = new Player();
		player.setName(this.name);
		player.setTeamId(this.teamId);
		player.setPosition(this.position);
		return player;
	}
}
