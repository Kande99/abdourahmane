
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

	<h1>Best joystick ever</h1>
	<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td>Delete</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${joysticks}" var="joystick">
				<tr>
					<td><img src = "${joystick.image}" width="100" height="100" /></td>
					<td>${joystick.year}</td>
					<td>${joystick.make}</td>
					<td>${joystick.model}</td>
					<td><a href= "/delete-joystick?id=${joystick.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
				
			
		</table>
	
	 <a href="/add-joystick">Add a joystick</a> 
<%@ include file="common/footer.jspf"%>