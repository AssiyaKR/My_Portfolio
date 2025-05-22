// Sélection des éléments du DOM
const timerElement = document.getElementById('timer');
const startButton = document.getElementById('start');
const stopButton = document.getElementById('stop');
const resetButton = document.getElementById('reset');

// Variables pour le timer
let timer = 1500; // 25 minutes en secondes
let intervalId = null;
let isRunning = false;

// Fonction pour formater le temps
function formatTime(seconds) {
    const minutes = Math.floor(seconds / 60);
    const remainingSeconds = seconds % 60;
    return `${minutes.toString().padStart(2, '0')}:${remainingSeconds.toString().padStart(2, '0')}`;
}

// Fonction pour mettre à jour l'affichage du timer
function updateTimer() {
    timerElement.textContent = formatTime(timer);
}

// Fonction pour démarrer le timer
function startTimer() {
    if (!isRunning) {
        intervalId = setInterval(() => {
            timer--;
            updateTimer();
            if (timer === 0) {
                clearInterval(intervalId);
                isRunning = false;
                alert('Temps écoulé !');
            }
        }, 1000);
        isRunning = true;
    }
}

// Fonction pour arrêter le timer
function stopTimer() {
    if (isRunning) {
        clearInterval(intervalId);
        isRunning = false;
    }
}

// Fonction pour réinitialiser le timer
function resetTimer() {
    stopTimer();
    timer = 1500;
    updateTimer();
}

// Événements pour les boutons
startButton.addEventListener('click', startTimer);
stopButton.addEventListener('click', stopTimer);
resetButton.addEventListener('click', resetTimer);

// Initialisation du timer
updateTimer();
