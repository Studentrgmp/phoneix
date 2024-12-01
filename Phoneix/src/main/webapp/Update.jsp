<%@page import="com.Phoneix.dto.Phoneix"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
<link rel="icon"
	href="https://cdn.pixabay.com/photo/2023/09/12/20/41/ai-generated-8249560_640.png">
<link rel="stylesheet" href="./Update.css">
</head>
<body>
	<div id="main">
		<div id="color"></div>
		<div id="left">
			<img
				src="https://cdn.pixabay.com/photo/2023/09/12/20/41/ai-generated-8249560_640.png"
				alt="" width="300px" height="300px">
		</div>
		<div id="right">
			<form action="update" method="post">
				<table>
					<thead>
						<tr>
							<td><h1 id="logo">
									CO<span>.</span>
								</h1></td>
						</tr>
						<tr>
							<td><h1 id="update">Update your Password</h1></td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label for="username">Email</label></td>
						</tr>
						<tr>
							<td><input type="email" name="Email"></td>
						</tr>
						<tr>
							<td><label for="New_Password">New Password</label></td>
						</tr>
						<tr>
							<td><input type="password" value="" name="New_Password"></td>
						</tr>
						<tr>
							<td><label for="Confirm_Password">Confirm Password</label></td>
						</tr>
						<tr>
							<td><input type="password" value="" name="Confirm_Password"></td>
						</tr>
						<tr>
							<td><button>Update</button></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>



</body>
</html>