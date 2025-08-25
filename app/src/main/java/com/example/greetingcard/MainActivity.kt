package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Change this line to display the desired greeting
            //GreetingScreen(message = christmasGreeting("Hugo"))
            GreetingScreen(message = birthdayGreeting("Hugo", 3))
        }
    }
}

@Composable
fun GreetingScreen(message: String) {
    GreetingCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Cyan
        ) {
            Text(
                text = message,
                modifier = Modifier.padding(24.dp)
            )
        }
    }
}

// Returns a Christmas greeting
fun christmasGreeting(name: String): String {
    return "Merry Christmas, $name!\n...and Happy New Year!"
}

// Returns a Birthday greeting
fun birthdayGreeting(name: String, age: Int): String {
    return "Happy Birthday, $name!\nYou are now $age years old!"
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // GreetingScreen(message = christmasGreeting("Preview User"))
    GreetingScreen(message = birthdayGreeting("Preview User", 3))
}