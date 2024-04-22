package com.example.chooseanumberapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            //Scenario:

            //You're tasked with creating a basic Android app using Android Studio and Kotlin.
        // The app should have a simple user interface with a text view and a button.

        // When the button is clicked, the text view should display a random number between 1 and 100.

            //Here are the steps to follow:

            //Create a new Android Studio project.

        //Design the user interface layout using XML. Include a TextView and a Button.

        //Define the logic to generate a random number and display it in the
        // TextView when the button is clicked.

        //Test the app on an emulator or a physical device to ensure it functions correctly.
            //Hints:

            //Use the TextView and Button widgets from the Android SDK to create the user interface.
            //Use Kotlin's Random class to generate random numbers.
            //Set an OnClickListener for the button to handle clicks.
        //Update the text of the TextView within the button's click listener.
            //Challenge Extension (Optional):

            //Add a feature to the app that allows the user to specify the range of random numbers.
        // For example, the user could input a minimum and maximum value, and the app should
        // generate a random number within that range.

         
        
        val ResultMessage = findViewById<TextView>(R.id.ResultMessage)


        val GenerateButton = findViewById<Button>(R.id.GenerateButton)


            GenerateButton.setOnClickListener {

            val Result = Random.nextInt()

                ResultMessage.text = "The number generated is ${Result.toString()}"

            }






        }
    }
