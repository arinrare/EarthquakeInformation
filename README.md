Requires installation of the latest Java Runtim Environment (JRE), downloadable from Oracle: http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html

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
