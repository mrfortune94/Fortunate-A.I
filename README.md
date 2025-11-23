# Fortunate-A.I

Android app integrating the xAI Grok API with developer mode and no restrictions enabled for unfiltered video generation.

## Setup Instructions

- Open this project in Android Studio.
- Your Grok API key is embedded in `MainActivity.java` for video generation. For production, consider securing it better.
- Build and run the app on an Android device or emulator.

## GitHub Actions

This repository includes a workflow `.github/workflows/android-build.yml` that automatically builds the debug APK on every push to the `fortunate-A.I` branch. The APK is uploaded as an artifact.

## Dependencies

- OkHttp 4.10.0 for HTTP communication.
- AndroidX AppCompat 1.6.1.

## Notes

- Do not share your API key publicly.
- Update API keys securely using environment variables for production applications.
