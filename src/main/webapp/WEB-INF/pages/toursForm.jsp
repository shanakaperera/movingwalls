<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
	<form action="/movingwalls/submit" method="post">
	
		des:<input type="text" name="description"><br /> start date :<input
			type="date" name="startDate"><br /> end date:<input
			type="date" name="endDate"><br /> mode : <input type="text"
			name="mode"><br /> ticket cost:<input type="number"
			name="ticketCost"><br /> home city cab cost:<input
			type="number" name="homeCityCabCost"><br /> destination city
		cab cost : <input type="number" name="destinationCityCabCost"><br />
		hotel cost:<input type="number" name="hotelCost"><br />
		manager user name :<select name="managerUserName">
			<c:forEach items="${managerList}" var="item">
				<option value="${item.name}">${item.name}</option>
			</c:forEach>
		</select>
		<input type="hidden" name="financeApproval" value="not yet"><br />
		<!-- 		<input type="hidden" name="userName" value="insaf"> -->
		<select name="status">
			<option value="draft">draft</option>
			<option value="submit">submit</option>
		</select> <input type="submit" value="ok">
	</form>
</body>
</html>