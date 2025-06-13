<?php

require 'connect.php';

?>
<!DOCTYPE html>
<html lang="pt">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f4f4f4;
			color: #333;
			margin-top: 100px;
		}

		.container {
			display: flex;
			justify-content: center;
		}

		form {
			max-width: 315px;
			margin: 75px 75px;
			padding: 29px;
			background-color: #fff;
			border-radius: 8px;
			box-shadow: 0 2px 4px rgba(0,0,0,0.1);
			flex-basis: calc(19% - 15px);
			height: 305px;
		}

		div {
			margin-bottom: 10px;
		}

		label {
			display: block;
			font-weight: bold;
		}

		input[type="email"], input[type="password"] {
			width: 100%;
			padding: 8px;
			margin-bottom: 10px;
			border: 1px solid #ddd;
			border-radius: 4px;
			box-sizing: border-box;
			margin-top: 8px;
		}

		button {
			width: 100%;
			padding: 10px;
			background-color: #0056b3;
			color: white;
			border: none;
			border-radius: 4px;
			cursor: pointer;
		}

		button:hover {
			background-color: #004494;
		}
	</style>
</head>
<body>
	<div class="container">
		<form method="POST">
			<h2>Login</h2>
			<hr>
			<br>
			<div>
				<label for="email">E-mail:</label>
				<input type="email" id="email" name="email" placeholder="E-mail" required>
			</div>
			<div>
				<label for="email">Senha:</label>
				<input type="password" id="email" name="senha" placeholder="Senha" required>
			</div>
			<button type="submit" name="login">Login</button>
		</form>
	<div>
</body>
</html>
<?php

if (isset($_POST['login'])) {
	
	$email = $_POST['email'];
	$senha = $_POST['senha'];
	
	$login = 'INSERT INTO usuarios (email, senha) VALUES (:email, :senha)';
	$stmt = $pdo->prepare($login);
	
	$stmt->bindParam(':email', $email);
	$stmt->bindParam(':senha', $senha);
	
	$result = $stmt->execute();
	
	if ($result) {
		echo '<script> alert("Login successful!") </script>';
	} else {
		echo '<script> alert("Login not successful!") </script>';
	}
	
}

?>