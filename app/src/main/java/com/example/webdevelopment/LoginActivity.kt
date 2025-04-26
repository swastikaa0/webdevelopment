package com.example.webdevelopment

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.webdevelopment.ui.theme.WebdevelopmentTheme


class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold { innerPadding ->
                InstaClone(innerPadding)
            }
        }
    }
}

@Composable
fun InstaClone(innerPadding: PaddingValues) {
    Column(
        modifier =
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 20.dp)

        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )

            Text(
                text = "Wesley", style =
                    TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
//                        fontStyle = FontStyle.Italic,
//                        textDecoration = TextDecoration.Underline,
                        textAlign = TextAlign.Center,
                    )
            )

            Icon(
                painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
            )
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            Image(
                painter = painterResource(R.drawable.people),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.
                height(120.dp).width(120.dp).
                clip(shape = RoundedCornerShape(100.dp))
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("174" , fontWeight = FontWeight.Bold,fontSize = 18.sp)
                Text("Posts", fontSize = 14.sp,
                    modifier = Modifier.padding(top=4.dp))
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text("772K" , fontWeight = FontWeight.Bold,fontSize = 18.sp)
                Text("Followers", fontSize = 14.sp,
                    modifier = Modifier.padding(top=4.dp))
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text("714", fontWeight = FontWeight.Bold,fontSize = 18.sp)
                Text("Following", fontSize = 14.sp,
                    modifier = Modifier.padding(top=4.dp))
            }
        }
        Column(
            modifier = Modifier
                .padding(start = 20.dp, top = 16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Row {
                Text("Wesley Queo")
            }
            Row {
                Text("Artist", color = Color.Gray)
            }
            Row {
                Text("DESIGNER")
            }
            Row {
                Text("isabella@art.design")
            }
            Row {
                Text("Followed by jenna and anna")
            }
        }

//

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { /* TODO: Follow action */ },
                shape = RoundedCornerShape(3.dp),
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3797EF),
                    contentColor = Color.White
                )
            ) {
                Text("Follow")
            }

            Button(
                onClick = { /* TODO: Message action */ },
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray, RoundedCornerShape(3.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }

            Button(
                onClick = { /* TODO: Email action */ },
                modifier = Modifier
                    .weight(1f)
                    .border(1.dp, Color.Gray, RoundedCornerShape(3.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text("Email", color = Color.Black)
            }

            OutlinedButton(
                onClick = { /* TODO: Dropdown action */ },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(3.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Icon(Icons.Default.KeyboardArrowDown, contentDescription = null)
            }
        }





    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInsta() {
    InstaClone(innerPadding = PaddingValues(0.dp))
}

