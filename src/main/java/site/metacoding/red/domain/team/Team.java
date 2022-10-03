package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;
	
	//엔티티가아닌 필드
	private Integer no;
	private String stadiumName;

}
