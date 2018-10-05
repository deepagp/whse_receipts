<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>


<body>

<h2>Welcome ${firstname}</h2>
<br><br>
<h2>Receive deliveries</h2>
<form:form method="post" action="/receive" modelAttribute="formPoItems">
	<table width="50%">
	

		<tr>
			<th>PONum</th>
			<th>ItemNbr</th>
			<th>Received Qty</th>
			<th>Ordered Qty</th>
			<th>Comments</th>
		</tr>
		<tr>
			<c:forEach items="${formPoItems}" var="poItem"
				varStatus="status">
				<tr>
					<td>${poItem.poNum}</td>
					<td>${poItem.itemNbr}</td>
					<td>${poItem.receivedQty}</td>
					<td>${poItem.orderedQty}</td>
					<td>${poItem.comments}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	<input type="submit" value="Receive"/>
	
	</form:form>


</body>
</html>