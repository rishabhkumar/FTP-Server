This is a quick guide to run this server for those who don't know.<br>
First of all install a Web Server on your machine, preferrably Tomcat 8 as it's free and fast.<br>
After installing it, in your directory in which Tomcat is installed, go in 'webapps' folder and create a new folder there.<br>
Name it anything, for example : s1<br>
Now in 's1', create 2 folders 'WEB-INF' and 'Uploaded'. <br>
In the newly created folder 'WEB-INF', again create a folder 'classes' and add the Java classes file in it.<br>
In the 'WEB-INF' folder also create a folder 'lib', and add all neccessary jar files in it.<br>
With these 2 folders, also add the 'web.xml' file with them in 'WEB-INF'.<br>
Outside WEB-INF folder, add the index.html file and the 2 images.<br>
Now open a web browser of any of the device connected to your router in which the Server is on.<br>
Type this in the address bar : x.y.z.a:8080/s1 <br>
x.y.z.a represents your IP Address<br>
Press Enter<br>
Boom!
