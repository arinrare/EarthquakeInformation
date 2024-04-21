Requires installation of the Java Runtim Environment (JRE) version 21, downloadable: https://adoptium.net/en-GB/temurin/archive/?version=21

Alternatively, you can use the JDK from this same download page. If you do this you don't need the JRE due to the JDK contatining a version of the JRE.

## Google API Key

Google Static Maps API key is not included. 

You need to generate your own API key to use with the application. See the Google help page here:
https://support.google.com/googleapi/answer/6158862?hl=en

Plans to make the GSM API Key usable via a command line switch. The app does not store your API key, and it communicates from the client directly with Google. It does not send your API key to a server. You are responsible for the privacy of your API key as per Google's terms. Do not add the API key to the application in a manner that is shown or shared publicly, nor store it on a platform like Github.

## Compiling and Running

To compile navigate to root project folder and run: 
javac -cp "reources/;resources/\*" src/controller/* src/view/components/* src/model/util/* src/model/facade/*  src/view/main/*.java -Xlint:deprecation --module-path javafx-sdk-22.0.1/lib --add-modules javafx.web,javafx.media,javafx.swing -d .\bin

Then use your editor/compiler to export a runnable JAR file from the project

The app needs the "resources" folder in the root directory to ouput the API json response, so make sure this is there when you run the JAR

To run navigate to root project folder and run (exchange jar/EarthquakeInformation.jar for the location of your jar file):
java -jar --module-path javafx-sdk-22.0.1/lib --add-modules javafx.web,javafx.media,javafx.swing --enable-preview jar/EarthquakeInformation.jar

## OS Support

OS Support: Windows 64 Bit
OSX: The program runs in OSX
Linux: Not yet tested, theoretically should work


## Roadmap

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

##### To add to issues

When conducting more than one search, under some conditions information from the previous search is stored and not cleared,
sometimes resulting in a lower earthqauke count than expected. If this occurs, restart the program and conduct the search again.