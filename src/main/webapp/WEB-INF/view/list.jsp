<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resourse/css/index3.css">
<script type="text/javascript" src="resourse/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
var aaa=1;
var bbb=1;
var ccc=1;

function aa(){
	if(aaa==1){
		aaa=0;
		alert(aaa)
	}else{
		aaa=1
		alert(aaa)
	}
	location="gettlist.do&aaa="+aaa;
}
function bb(){
	if(bbb==1){
		bbb=0;
		alert(bbb)
	}else{
		bbb=1
		alert(bbb)
	}
	location="gettlist.do&bbb="+bbb;
}
function cc(){
	if(ccc==1){
		ccc=0;
		alert(ccc)
	}else{
		cccc=1
		alert(ccc)
	}
	location="gettlist.do&ccc="+ccc;
}



//隐藏
    $(function(){
    	$("form").hide();
    })
    //全选
	function qx() {
		$(":checkbox").attr("checked", true)
	}
	//反选
	function fx() {
		$(":checkbox").each(function() {
			$(this).attr("checked", !$(this).prop("checked"))
		})
	}
	//批量删除
	function plsc() {
		var ids = "";
		$(":checkbox:checked").each(function() {
			ids += "," + $(this).val();
		})
		ids = ids.substring(1);
		alert(ids);
		$.post("delete.do", {
			ids : ids
		}, function(flag1) {
			if (flag1) {
				alert("删除影片成功");
				location = "gettlist.do";
			} else {
				alert("删除影片失败");
			}
		}, "json")
	}
	
	//查询
	function cx(){
		$("form").show();
	}
	function aa1(){
		
	}
	function xj(id){
		$.post("xj.do",{id:id},function(flag2){
			if(flag2){
				alert("修改成功");
				location="gettlist.do";
			}else{
				alert("修改失败");
			}
		},"json")
	}
</script>
</head>
<body>

	<button onclick="cx()">查询影片</button>
	<button>添加影片</button>
	<button onclick="plsc()">删除影片</button>
	<table>
		<tr>
			<td>
				<button onclick="qx()">全选</button>
				<button onclick="fx()">反选</button>
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td><button onclick="aa()">上映时间</button></td>
			<td><button onclick="bb()">时长</button></td>
			<td>类型</td>
			<td><button onclick="cc()">年代</button></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td><input type="checkbox" name="id" value="${l.id}"></td>
				<td>${l.name}</td>
				<td>${l.docter}</td>
				<td>${l.price}</td>
				<td>${l.time}</td>
				<td>${l.timelong}</td>
				<td>${l.type}</td>
				<td>${l.year}</td>
				<td>${l.place}</td>
				<td>${l.sname}</td>
				<td>
					<button>详情</button>
					<button>编辑</button>
					<button onclick="xj('${l.id}')">
					  <c:if test="${l.sid==0}">
				          上架
				      </c:if>
				      <c:if test="${l.sid==1}">
				    正在热映
				      </c:if>
				      <c:if test="${l.sid==2}">
				    下架
				      </c:if>
					</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">${fenye}</td>
		</tr>
	</table>



	<form action="gettlist.do" method="post">
		<table>
			<tr>
				<td>影片名称</td>
				<td>
				    <input type="text" name="name">
				</td>
			
				<td>上映时间</td>
				<td>
				    <input type="text" name="time">
				</td>
			</tr>
			<tr>
				<td>导演</td>
				<td>
				    <input type="text" name="docter">
				</td>
			
				<td>价格</td>
				<td>
				    <input type="text" name="minprice">-<input type="text" name="maxprice">
				</td>
			</tr>
			<tr>
				<td>电影年代</td>
				<td>
				    <input type="text" name="minyear">-<input type="text" name="maxyear">
				</td>
			
				<td>电影时长</td>
				<td>
				    <input type="text" name="mintimelong">-<input type="text" name="maxtimelong">
				</td>
			</tr>
			<tr>
				<td colspan="11">
				    <button>查询影片</button>
				    <input type="button" value="重置查询" > 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>