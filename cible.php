<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Résultat</title>
</head>
<body>
    <?php
    // Vérifier si les données ont été envoyées
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $name = isset($_POST['name']) ? htmlspecialchars($_POST['name']) : '';
        $email = isset($_POST['email']) ? htmlspecialchars($_POST['email']) : '';
        $message = isset($_POST['message']) ? htmlspecialchars($_POST['message']) : '';

        echo "<h2>Données reçues :</h2>";
        echo "<p><strong>Nom :</strong> $name</p>";
        echo "<p><strong>Email :</strong> $email</p>";
        echo "<p><strong>Message :</strong> " . nl2br($message) . "</p>";
    } else {
        echo "<p>Aucune donnée reçue.</p>";
    }
    ?>

    <h3>Modifier vos informations</h3>
    <form action="cible.php" method="post">
        <label for="name">Nom :</label>
        <input type="text" name="name" id="name" value="<?= isset($name) ? $name : ''; ?>" required>

        <label for="email">Email :</label>
        <input type="email" name="email" id="email" value="<?= isset($email) ? $email : ''; ?>" required>

        <label for="message">Message :</label>
        <textarea name="message" id="message" required><?= isset($message) ? $message : ''; ?></textarea>

        <button type="submit">Mettre à jour</button>
    </form>

    <br>
    <a href="index.php">Revenir au formulaire</a>
</body>
</html>
