raywenderlich.com Android Sample App
---
This Gradle project is a barebones Android Studio application that sets up some of the basics according to standards for raywenderlich.com Android tutorial sample projects. Such things include:

- Sets the tab width to 2 spaces (4 on wrapping lines) throughout the project
- Has the correct form for the package name
- Includes an RW icon
- Defaults new files to use the correct copyright information

## How To Use This
First, download RWAndroidTutorial.zip from this repo and use that. Tutorial sample projects should not include a git repo, so *please do not* clone this repo and then start making modifications as the sample project. Having said that, if you are familiar with how to remove the .git folder and ultimately create a zip file from the sample project that does not include it, then by all means, please do so.

After downloading and unzipping the skeleton project, several pieces should be changed to unique values such that they are relevant to the tutorial under development, including:

- Refactor the package name to match the sample app you are building (search for instructions on how to do this, e.g. [here](https://stackoverflow.com/questions/16804093/android-studio-rename-package))
- Change the colors in `colors.xml` to what you want for your tutorial
- (Optional): Update the app icon
- Rename the top-level directory to match your sample project name
- If you are using git and GitHub to manage your sample project development, be sure to start with the .gitignore file on the Android Team Guide [here](https://www.raywenderlich.com/tutorial-team/android-team-guide).

## To-Do
Next steps are to add a splash screen to the sample project.
