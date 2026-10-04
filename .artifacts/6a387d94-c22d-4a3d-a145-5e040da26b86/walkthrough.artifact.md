# Walkthrough: Fixed App Crash on Startup

I have resolved the issue where the app was crashing on startup and not showing the UI.

## Changes Made

### Build Configuration

#### [app/build.gradle.kts](file:///Users/timileyinsonibare/Documents/Android-courses/app/build.gradle.kts)
- Applied the `kotlin-serialization` compiler plugin. This is required for type-safe navigation to work correctly at runtime.

```diff
 plugins {
     alias(libs.plugins.android.application)
     alias(libs.plugins.kotlin.android)
     alias(libs.plugins.kotlin.compose)
+    alias(libs.plugins.kotlin.serialization)
 }
```

## Verification Results

### Automated Tests
- Gradle sync was successful.
- Build (`app:assembleDebug`) completed successfully.

### Manual Verification
- Deployed the app to the emulator.
- Verified that the app no longer crashes with a `SerializationException`.
- Confirmed the UI is visible via a screenshot.

![Login Screen Screenshot](/Users/timileyinsonibare/Documents/Android-courses/.artifacts/6a387d94-c22d-4a3d-a145-5e040da26b86/screenshot_login.png)
