package com.st10447872.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //declare variables so we can initialize them at a later stage
    // the keyword lateinit allows us to initialize a variable at a later stage
    //variables had to be created so that the process would correspond them with their said ID names found in the xml
    private lateinit var searchButton: Button
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // i initliaized the values using the find view by id method
        //this makes the process easier by allowing us to just type the variables instead of initializing them within the process
        searchButton = findViewById(R.id.searchButton)
        ageInput = findViewById(R.id.ageInput)
        clearButton = findViewById(R.id.clearButton)
        resultTextView = findViewById(R.id.resultTextView)

        //inorder for the user to submit his value a button had to implemented.
        //to make this button functional the setonclicklistener method was used.
        //we also had to make use of if statements inorder to get the statements out at the correct time
        searchButton.setOnClickListener {
            Log.d("searchButton", "Search button clicked")

            //making use of log statements so that developers can see exactly what is going on behind each process
            //an age bracket had to be created inorder to make sure that the user would not be able to punch in random values that are not accepted
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age in 20..90) {
                Log.d("ageInput", "Valid age entered: $age")

                //a variable called singer name had to be created inorder for the app to add "the singers name is..."
                //i opted not to use strings.xml for the following values.
                //the devs will be ables to see everything on the base code instead of searching for it in the xml's
                val singerName = when (age) {
                    36 -> "Bob Marley - Known for his unique vocal and compositional approach, Marley was regarded as one of the pioneers of the genre, fusing elements of rocksteady, ska, and reggae in his songs.  36 years of age "
                    40 -> "John Lennon - As the founding member, co-composer, co-lead vocalist, and rhythm guitarist of the Beatles, John Winston Ono Lennon was an English singer, songwriter, and musician who attained international recognition.  40 years of age "
                    50 -> "Micheal Jackson - The King of Pop is often seen as one of the most influential cultural figures of the twentieth century. His contributions to dance, fashion, music, and his publicized personal life throughout the course of his four-decade career elevated him to a worldwide icon in popular culture. Jackson has an impact on musicians in many different genres. 50 years of age "
                    83 -> "Tina turner - Trained as the main vocalist for the husband-wife team Ike & Tina Turner, she became well-known as the Queen of Rock 'n' Roll before beginning a prosperous solo career. 83 years of age "
                    21 -> "Jared anthony higgins (juice wrld) - He was a prominent figure in the four-year career-spanning emo rap and SoundCloud rap scenes, which gained widespread recognition in the mid-to-late 2010s. 21 years of age "
                    26 -> "Dayvon Daquan Bennett (king von) - He is regarded by many as one of the most important characters in the drill genre. 26 years of age "
                    20 -> "Jahseh Dwayne Ricardo Onfroy (xxxtentacion) - XXXTentacion was a controversial character because of his well-publicized legal issues, but his music about alienation and sadness helped him develop a cult following among his youthful fan base throughout his brief career. 20 years of age "
                    44 -> "Freddy mercury - As the main vocalist and pianist of the rock group Queen, Freddie Mercury was a British singer and composer who attained international recognition. Recognized as one of the most exceptional vocalists in the annals of rock music, he was renowned for his exuberant onstage presence and vocal range spanning four octaves. 44 years of age "
                    25 -> "Tupac shakur - He is regarded by many as one of the greatest successful and influential rappers of all time. Shakur has sold over 75 million records worldwide, making him one of the best-selling musicians. 25 years of age "
                    48 -> "Whittney housten. With over 220 million recordings sold worldwide, the Voice is widely recognized as one of the greatest vocalists in music history and one of the most successful musicians of all time. 48 years of age "
                   else -> null
                }
                //the following else statements allows the program to display a message that tells the user to input a valid age or that there is no singer found with said age
                val message = if (singerName != null) "the singers name is $singerName"
                else "no singer found with the entered age."
                Log.d("singerName", message)
                resultTextView.text = message
            } else {
                Log.d(
                    "resultTextView",
                    "Invalid input. Please enter a valid age between 20 and 90."
                )
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 90."
            }
        }
        //the process below is for the second button implemented in the system.
        //this button allows the user to clear the information found on the resultTextView.
        //we also logged this process for developers to see behind the process
        clearButton.setOnClickListener {
            Log.d("clearButton", "Clear button clicked")
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}

// all info was found at :
//Wikipedia Contributors (2019). Wikipedia, the free encyclopedia. [online] Wikipedia. Available at: https://en.wikipedia.org/wiki/.
//Google (2019). Google. [online] Google.com. Available at: https://www.google.com/search?.