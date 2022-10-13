#01.First Open the project any IDE (Eclipse or Intelij)
02. open the pom.xml file 
03.Update the versions running on your machine in the "property tag". I have parameterized the dependency versions
<properties>
        <java.version>17</java.version>
        <junit.version>4.13.2</junit.version>
        <cucumber.version>7.8.0</cucumber.version>
        <selenium.version>4.4.0</selenium.version>
        <maven.comiler.version>3.8.1</maven.comiler.version>
        <maven.surefire.version>2.22.2</maven.surefire.version>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
	
04.Open the terminal and type the "mvn clean install -DskipTests"

05.Please open the "config.properties" file and change the chrome driver path 

06.I have created a regression suit xml file in this project. You can also run it. File name is "assignment_regression.xm"
