# OpenCV5-Contrib-Android
OpenCV 5.x SDK plus opencv_contrib for Android.  You can simply get the repo and add to your Droid project.  

Or you can compile by yourself with your specific versions.  Some helpful links:   

- https://github.com/opencv/opencv/releases
- https://github.com/opencv/opencv/wiki/Custom-OpenCV-Android-SDK-and-AAR-package-build

1) git pull.  Make sure the branch is 5.x.  Do the same for opencv_contrib as well.  They should be under the same parent folder.
2) Go to the opencv folder.  Create a folder called **build**.
3) Delete everything under opencv/build every time you run the python command below.
4) **Important**: Find the right NDK version (/Users/xxx/Library/Android/sdk/ndk/28.2.13676358) based on
Android Gradle Plugin (AGP) version.  For AGP 9.2.1, NDK = 28.2.

If they don't match, then OpenCVLoader.initLocal() in your app will fail even though you can still generate the library.

5) Make changes as follows (or pick your own version numbers):

<img width="708" height="641" alt="Screenshot 2026-06-27 at 11 13 05 PM" src="https://github.com/user-attachments/assets/17ac1dd8-8c83-4e3e-9e80-ac830752a013" />

<img width="708" height="519" alt="Screenshot 2026-06-27 at 11 13 29 PM" src="https://github.com/user-attachments/assets/1e63d1a2-80b6-4e7d-af98-e8322b72a0de" />

<img width="619" height="460" alt="Screenshot 2026-06-27 at 11 13 57 PM" src="https://github.com/user-attachments/assets/5f3a82c5-101b-4d12-b34e-ec4e2153e1ca" />

6) Run the code below in Terminal (at opencv).  **xxx** should be your own username.
```
python3 platforms/android/build_sdk.py \
build \
--ndk_path=/Users/xxx/Library/Android/sdk/ndk/28.2.13676358 \
--sdk_path=/Users/xxx/Library/Android/sdk \
--extra_modules_path=../opencv_contrib/modules \
--config=platforms/android/ndk-25.config.py \
--use_android_buildtools \
--no_samples_build
```
↑ Takes time.  Just be patient...  
Notice the last line: the sample project is not part of this build.  Delete the line if you want.    
