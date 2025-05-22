<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulaire</title>
</head>
<body>
    <h2>Formulaire d'inscription</h2>
    <form action="cible.php" method="post">
        <label for="name">Nom :</label>
        <input type="text" name="name" id="name" required>

        <label for="email">Email :</label>
        <input type="email" name="email" id="email" required>

        <label for="message">Message :</label>
        <textarea name="message" id="message" required></textarea>

        <button type="submit">Envoyer</button>
    </form>
</body>
</html>
