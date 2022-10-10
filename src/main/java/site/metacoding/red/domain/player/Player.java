package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter;
	private Timestamp createdAt;
	
	//트랜직트 -> 일시적인 데이터
	private Integer no;
	private String teamName;
}
