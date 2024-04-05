# IMAD-ASSIGNMENT-PART-1-ST10447872
IMAD MODULE ASSIGNMENT SEMESTER 1 PART 1 - HISTORY APP
Content 

We were given the task to create an app that would output information based on the value inputted by the user. There were numerous aspects that had to consider when designing and coding for the app: these were as follows: 

Image views – there are a total of two image views in the application. Was used to make the background of the app and the other is located on the top right corner to add decoration and personalisation to app. 

Buttons – there are a total of two buttons across the application making it very simple for the user to input values. One of these buttons is a submit button that allows the user to submit any value they have enter the system. The other button is a simple clear button which just clears any information that the system had outputted. 

Edit text – there is only one edit text to keep everything simple and to not confused the user. All this edit text does is allow the user to input a value. This edits text corresponds with the submit button 

Text views – there were two text views that were used throughout the application. The first one is the simplest. All it says is “The History App” and its function is just to serve as a title to the app. However, the result text view is the most important function of the app. Without it the user would not be delivered the required information when inputting a certain number into the system. 

 

 

 

Information 

When the user punched in a value there would be 10 different outcomes to what would happen. The following information will be displayed when the user inputs a certain value: 

 

Bob Marley - Known for his unique vocal and compositional approach, Marley was regarded as one of the pioneers of the genre, fusing elements of rocksteady, ska, and reggae in his songs.  user inputs the number 36 

John Lennon - As the founding member, co-composer, co-lead vocalist, and rhythm guitarist of the Beatles, John Winston Ono Lennon was an English singer, songwriter, and musician who attained international recognition.  user inputs the number 40  

Micheal Jackson - The "King of Pop" is often seen as one of the most influential cultural figures of the twentieth century. His contributions to dance, fashion, music, and his publicized personal life throughout the course of his four-decade career elevated him to a worldwide icon in popular culture. Jackson has an impact on musicians in many different genres. User inputs the number 50 

Tina turner - Trained as the main vocalist for the husband-wife team Ike & Tina Turner, she became well-known as the "Queen of Rock 'n' Roll" before beginning a prosperous solo career. User inputs the number 83  

Jared anthony higgins (juice wrld) - He was a prominent figure in the four-year career-spanning emo rap and SoundCloud rap scenes, which gained widespread recognition in the mid-to-late 2010s. User inputs the number 21 

Dayvon Daquan Bennett (king von) - He is regarded by many as one of the most important characters in the drill genre. User inputs the number 26 

Jahseh Dwayne Ricardo Onfroy (xxxtentacion) - XXXTentacion was a controversial character because of his well-publicized legal issues, but his music about alienation and sadness helped him develop a cult following among his youthful fan base throughout his brief career. User inputs the number 20  

Freddy mercury - As the main vocalist and pianist of the rock group Queen, Freddie Mercury was a British singer and composer who attained international recognition. Recognized as one of the most exceptional vocalists in the annals of rock music, he was renowned for his exuberant onstage presence and vocal range spanning four octaves. User inputs the number 44  

Tupac shakur - He is regarded by many as one of the greatest successful and influential rappers of all time. Shakur has sold over 75 million records worldwide, making him one of the best-selling musicians. User inputs the number 25 

Whittney housten. With over 220 million recordings sold worldwide, "the Voice" is widely recognized as one of the greatest vocalists in music history and one of the most successful musicians of all time. User inputs the number 48 

Theme 

The theme of the app is based on the music industry. The information that gets displayed is the artists and information about them. When the user would input a value, he/she would get an output in the form of information. For example, when the user inputted 50 as a value, they would have gotten Michael Jackson as an output along with the information that about his achievements. Included nicknames he was given and/or bands the artist was previously apart off. The app is revolved around the music era thus all the information displayed is regarding music. There are different types of genres included among the artists. Some are rock, emo, melodic rap, etc. The design of the app is revolved around the user making simple and easy to use. While still doing the task the program was assigned to do.  

 

Main.activity.xml 

The main.activity.xml contains most of the tools needed for app to run. Using a simple drag and drop feature with android studio we can ensure that the app has enough buttons/text views/image views/edit texts. We also make user of the auto generated code that comes with the base features of the app. When the button is dropped onto the screen, the app will auto generate a code for that said button. However, we change things like the id, text size and text colour to our own personal benefit. The only thing that has been left alone during the completion of the app was the image views. The only thing we changed during the completion of the app was the actual measurements of the image. 

 

 

Main.activity.kt 

The main.activity.kt is one of the most important aspects of code regarding the app. In this file we create the functions for every program we will use. These include: 

To make the buttons function we needed to create 2 variables called searchButton and clearButton. We created these variables under the class mainactivity. We then use override.fun class to make both these buttons work with the rest of the application 

To make the text view functional we needed to create a variable for it. We named the variable resultTextView under the class mainactivity. We then used the override.fun class to make the buttons work simultaneously with the text view. The clear button works directly with this text view to clear any message displayed on the screen. The text view displays the information stated in the information tab.  

To make the edit text functional we needed to create a variable for it. We named the variable ageInput under the class mainactivity. We then user the override.fun class to make the edit text usable. Meaning for the program to detect the age inputted and display an output it had to understand it. We made use of if, else and when statements when coding for the task. The user would input an age he or she had thought of and then click the submit button. The text view would then display information state in the information tab. 

 

References 

Wikipedia Contributors (2019). Wikipedia, the free encyclopedia. [online] Wikipedia. Available at: https://en.wikipedia.org/wiki/. 

 

Google (2019). Google. [online] Google.com. Available at: https://www.google.com/search?. 

 

Kotlin Help. (n.d.). Kotlin books | Kotlin. [online] Available at: https://kotlinlang.org/docs/books.html. 

 

LINKS 

https://youtu.be/205yEotJ6Bw ‌ 

‌ 

 

‌ 

 
