<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<input id="name" type="text" class="form-control" placeholder="Enter name">
		</div>

		<button id="btnInsert" type="button" class="btn btn-primary">경기장 등록 완료</button>
	</form>
</div>

<script>
		$("#btnInsert").click(()=>{
			insert();
		});
	
		function insert(){
			let data = {
				name: $("#name").val()
			}

			$.ajax("/stadium",{
				type: "POST",
				dataType: "json", // 응답 데이터
				data: JSON.stringify(data), // http body에 들고갈 요청 데이터
				headers: { // http header에 들고갈 요청 데이터
					"Content-Type": "application/json; charset=UTF-8"
				}//charset=UTF-8무조건 넣기
			}).done((res)=>{
				if(res.code == 1){//성공
					location.href="/stadium";
				}else{//실패
					alert("경기장 등록에 실패 하였습니다.")
				}
			});
		}
	</script>

<%@ include file="../layout/footer.jsp"%>

