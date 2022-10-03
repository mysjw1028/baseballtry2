package site.metacoding.red.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CMResponse <T>{
	private Integer code;
	private String msg;
	private T data;
}
