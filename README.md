## raywenderlich.com Android Sample App

This project is a barebones Android Studio project that sets up some of the basics according to standards for raywenderlich.com Android tutorial sample projects.

Such things include:

- Correct format for the package name
- An RW launcher icon
- A Splash screen
- RW code style
- RW copyright profile

<img src="img/working_gif.gif" height="480"/>

## How To Use This

First, download RWAndroidTutorial.zip from this repo and use that. Tutorial sample projects should not include a git repo, so _please do not_ clone this repo and then start making modifications as the sample project. Having said that, if you are familiar with how to remove the .git folder and ultimately create a zip file from the sample project that does not include it, then by all means, please do so.

After downloading and unzipping the skeleton project,

1.  IMPORTANT: Android Studio has weird behaviour that it allows to edit its default code style, which means if it is modified and you open this project in Android Studio it will delete all pre-setup codestyle and copyright profile in this project. To fix that please follow along as below:

    - We first need to verify that your `Default` codestyle isn't modified. To check that please open Android Studio with any project except this one. Then navigate to `Preferences>Edior>Codestyle` and check if your code scheme has `Default` in **BLUE** color (this means it is modified).

      ![modified_default](img/modified_default.png)

    - However if it is not colored **BLUE**, you are good and you can go ahead to open this project and everything should be pre-setup for you.

    - If it is modified (colored **BLUE**), then click on the cog icon and select `Restore Default`

      ![restore_default](img/restore_default.png)

    - After you hit that option, simply accept the change

      ![accept_change](img/accept_change.png)

    - Once done, you will see your Default is no more colored **BLUE** or modified, which means you are good

      ![unmodified_default](img/unmodified_default.png)

    - Now simply go ahead and open this project and everything should be pre-setup for you.

1.  Several pieces should be changed to unique values such that they are relevant to the tutorial under development, including:
    - Goto the root of the project folder and delete `img` folder (this contains images which are shown here in the Readme)
    - Refactor the package name to match the sample app you are building (search for instructions on how to do this, e.g. [here](https://stackoverflow.com/questions/16804093/android-studio-rename-package))
    - Change the colors in `colors.xml` to what you want for your tutorial
    - (Optional): Update the app icon
    - Rename the top-level directory to match your sample project name
    - If you are using git and GitHub to manage your sample project development, be sure to start with the .gitignore file on the Android Team Guide [here](https://www.raywenderlich.com/tutorial-team/android-team-guide).
