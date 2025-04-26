package com.example.webdevelopment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.webdevelopment.ui.theme.WebdevelopmentTheme
import java.nio.file.WatchEvent

class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold { innerPadding ->
                CardClone(innerPadding)
            }
        }

    }
}



@Composable
fun CardClone(innerPadding: PaddingValues){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color (0xFF00C389))
            .padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column {
                Text(
                    text = "Card", fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Simple and easy to use app",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Image(
                painter = painterResource(id = R.drawable.people),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(50))
            )

        }

        Spacer(modifier = Modifier.height(20.dp))


        val items = listOf(
            Pair(R.drawable.book, "Text" to "15 items content"),
            Pair(R.drawable.church, "Address" to "5 items content"),
            Pair(R.drawable.character, "Character" to "10 items content"),
            Pair(R.drawable.card, "Bank card" to "5 items content"),
            Pair(R.drawable.key, "Password" to "15 items content"),
            Pair(R.drawable.box, "Text" to "15 items content")
        )


        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.weight(1f)
        ) {
            for (row in items.chunked(2)) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    for ((icon, textPair) in row) {
                        CardItem(
                            icon = icon,
                            title = textPair.first,
                            subtitle = textPair.second,
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
// Settings Footer
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.setting),
                contentDescription = "Settings",
                tint = Color.Gray,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text("Settings", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text("Fingerprint code and so on", fontSize = 12.sp, color = Color.Gray)


            }
            }
        }
    }


@Composable
fun CardItem(icon: Int, title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.White, RoundedCornerShape(16.dp))
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = title,
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
        Text(subtitle, fontSize = 12.sp, color = Color.Gray)
    }

}










@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    CardClone(innerPadding = PaddingValues(0.dp))
}
