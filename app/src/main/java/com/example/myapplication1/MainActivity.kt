package com.example.myapplication1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteSimple()
        }
    }
}

@Composable
fun CarteSimple() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(100.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Partie haute : logo (fictif), nom et titre
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.meevent7),
                contentDescription = "Photo de profil",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape), // Forme circulaire pour la photo de profil
                contentScale = ContentScale.Crop // Recadre l'image pour remplir le cercle
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Assiya Kouraa", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text("Software and Data", fontSize = 16.sp, color = Color.Gray)
            Text("Engineering Student", fontSize = 16.sp, color = Color.Gray)
               }
        Spacer(modifier = Modifier.height(48.dp)) // Espace entre les sections


        // Partie basse : contacts
        Column(horizontalAlignment = Alignment.Start) {
            LigneContact(Icons.Default.Phone, "+212 626026451")
            LigneContact(Icons.Default.Email, "kouraaassiya@gmail.com")
        }
    }
}

@Composable
fun LigneContact(icone: ImageVector, texte: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Icon(imageVector = icone, contentDescription = null, tint = Color(0xFF3F51B5))
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = texte, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ApercuCarte() {
    CarteSimple()
}
