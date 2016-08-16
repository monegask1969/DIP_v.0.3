<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="dog">

	<table>
		<tr>
			<td><form:label path="breed">
				<spring:message code="label.breed" />
			</form:label></td>
			<td><form:input path="breed" /></td>
		</tr>
		<tr>
			<td><form:label path="gender">
				<spring:message code="label.gender" />
			</form:label></td>
			<td><form:input path="gender" /></td>
		</tr>
		<tr>
			<td><form:label path="name">
				<spring:message code="label.name" />
			</form:label></td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td><form:label path="dob">
				<spring:message code="label.dob" />
			</form:label></td>
			<td><form:input path="dob" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.adddog"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.dogs" /></h3>
<c:if test="${!empty dogsList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.breed" /></th>
			<th><spring:message code="label.gender" /></th>
			<th><spring:message code="label.name" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${contactList}" var="dog">
			<tr>
				<td>${dog.breed}, ${dog.gender}</td>
				<td>${dog.name}</td>
				<td>${dog.dob}</td>
				<td><a href="delete/${dog.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>