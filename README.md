# nCino
NCino Online Assessment – Automation Framework
Created a selenium hybrid framework for the given testcases/scenarios using Page Object Model in TestNG. The source code has pushed to gitHub.
Tools Used :
     -Java, Selenium, TestNG, Maven & Page Object Model,Git ,GitHub .
Testcases Covered:
 Web Application URL : http://todomvc.com/

Setup Steps:
1. Open browser and navigate to above url.
2. Click Labs tab
3. Select Angular 2.0 link

Test Scenario 1: Add a Todo item
Test Scenario 2: Edit the content of an existing Todo item

Create Folder Structure :

Project Name : nCino_Assessment1
src/test/java    
|
pageObjects (Package)  - Created the page objects (introduction & todo screens)under this folder for all screens.
|
testBase (Package)  - it has common methods has been defined in base class.
|
testCases (Package) - Contains main testcases
|
utilities (Package) - it has extentmanager file which helps to see reports 


src/test/resources 

logs (Folder) - It contains logs reports which will be updated after the excution.
|
screenshots (Folder) - Will help to see the failed cases screenshots we can track it .
|
reports (Folder) -It contains the test reports in the form of html get the overview of test execution results (No .of cases passed or failed)
|
testNG.xml - Which helps to run the all testcases at a time.
|
pom.xml - Added the dependency files.


Instruction to run the build :

1. Please find the source code in the Git repository : 
https://github.com/ThangamKumar/nCino.git

2. Download as Zip folder.

3. Please make your all the setup (Chrome, TestNg, Maven) with proper versions.

4. Import the packages to the local device

5. Click on Run/Execute "testng.xml" file to execute the code for the desired output.
 

Points to note:

1. Since we have simple test cases to excute I have hard coded the test data and url instead of using config.property file.
2. In the scenario 2, for editing the to do item have used 'action class' to edit the given data. However, we can acheive the same using 'clear' method/function.

