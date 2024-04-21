Requires installation of the Java Runtim Environment (JRE) version 21, downloadable: https://adoptium.net/en-GB/temurin/archive/?version=21

Alternatively, you can use the JDK from this same download page. If you do this you don't need the JRE due to the JDK contatining a version of the JRE.

Google Static Maps API key is not included. (/src/model/util/EarthquakeCommand.java)
apiKeyGSM = "#################"; (Fill in your API key here before compiling)
You need to generate your own API key to use with the application. See the Google help page here:
https://support.google.com/googleapi/answer/6158862?hl=en

21/04/2024 - Plans to add a way to add your own API key into the program.

To compile navigate to root project folder and run: 
javac -cp "reources/;resources/\*" src/controller/* src/view/components/* src/model/util/* src/model/facade/*  src/view/main/*.java -Xlint:deprecation --module-path javafx-sdk-22.0.1/lib --add-modules javafx.web,javafx.media,javafx.swing -d .\bin

Then use your editor/compiler to export a runnable JAR file from the project

The app needs the "resources" folder in the root directory to ouput the API json response, so make sure this is there when you run the JAR

To run navigate to root project folder and run (exchange jar/EarthquakeInformation.jar for the location of your jar file):
java -jar --module-path javafx-sdk-22.0.1/lib --add-modules javafx.web,javafx.media,javafx.swing --enable-preview jar/EarthquakeInformation.jar

OS Support: Windows 64 Bit
OSX: The program runs in OSX
Linux: Not yet tested, theoretically should work

Note: The resources directory is required for the program to work.
Running on a 4K monitor: The program was made in 2016 and is not built to work on a 4K monitor. In the executable folder i have provided a shortcut for Windows that sets Compatibility for High DPI mode. You just need to change the file location of the jar file in the properties of the shortcut if you move the shortcut. You will need to run in compatibility mode most likely or the text amd map will be too small. This is intended to be fixed to scale properly at some point.

21/04/2024 - Soon to come, compile intructions and a way to add your own API key to the application without having to recompile.

Program is unfinished.
Known Bugs:
When conducting more than one search, under some conditions information from the previous search is stored and not cleared,
sometimes resulting in a lower earthqauke count than expected. If this occurs, restart the program and conduct the search again.

TODO:
-Fix stored data from previous searches bug
-Tidy up GUI layouts
-Investigate the use of a new map source to overcome google maps limits such as maximum 36 labelled markers, and the static maps URL Limit of 2048 characters
-Include documentation
-Reorder earthquake or city list numbers to always display incrementing from 1, when a list is sorted by another column
-Set up exporting of data to spreadsheets
-Allow default options to be saved
-Package program into an installer that will include automatic installation of the JRE (So the user does not have to do this themselves)
-Investigate other uses of data that the user may like to have implemented, such as graphing of quakes, or other analytics
-Improve the status bar reports, and have them auto fade after a set time
