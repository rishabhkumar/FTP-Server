This is a quick guide to run this server for those who don't know.
First of all install a Web Server on your machine, preferrably Tomcat 8 as it's free and fast.
After installing it, in your directory in which Tomcat is installed, go in 'webapps' folder and create a new folder there.
Name it anything, for example : s1
Now in 's1', create 2 folders 'WEB-INF' and 'Uploaded'. 
In the newly created folder 'WEB-INF', again create a folder 'classes' and add the Java classes file in it.
In the 'WEB-INF' folder also create a folder 'lib', and add all neccessary jar files in it.
With these 2 folders, also add the 'web.xml' file with them in 'WEB-INF'.
Outside WEB-INF folder, add the index.html file and the 2 images.
Now open a web browser of any of the device connected to your router in which the Server is on.
Type this in the address bar : x.y.z.a:8080/s1 
x.y.z.a represents your IP Address
Press Enter
Boom!
