# OpenCV5-Contrib-Android
OpenCV 5.x SDK plus opencv_contrib for Android

https://github.com/opencv/opencv/releases

https://github.com/opencv/opencv/wiki/Custom-OpenCV-Android-SDK-and-AAR-package-build

1) git pull.  Make sure the branch is 5.x.  Do the same for opencv_contrib as well.  They should be under the same parent folder.
2) Go to the opencv folder.  Create a folder called **build**.
3) Delete everything under opencv/build every time you run the python command below.
4) Find the right NDK version (/Users/xxx/Library/Android/sdk/ndk/28.2.13676358) based on
Android Gradle Plugin (AGP) version.  For AGP 9.2.1, NDK = 28.2
5) Run the code below in Terminal (at opencv):

python3 platforms/android/build_sdk.py \\

build \\

--ndk_path=/Users/xxx/Library/Android/sdk/ndk/28.2.13676358 \\

--sdk_path=/Users/xxx/Library/Android/sdk \\

--extra_modules_path=../opencv_contrib/modules \\

--config=platforms/android/ndk-25.config.py \\

--use_android_buildtools \\

--no_samples_build

5) Errors happen with jcenter().  Replace them with mavenCentral().
6) ndk-25.config.py needs to have the latest version numbers.
