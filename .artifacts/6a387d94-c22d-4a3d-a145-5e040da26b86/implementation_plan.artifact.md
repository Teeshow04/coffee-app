# Fix App Crash due to Missing Serialization Plugin

The app is failing to build/run correctly because it crashes at runtime with a `SerializationException`. This is caused by using type-safe navigation with `kotlinx.serialization` without having the serialization compiler plugin applied in the app module.

## User Review Required

> [!IMPORTANT]
> I need to modify `app/build.gradle.kts` to apply the `kotlin-serialization` plugin. This will trigger a Gradle sync.

## Proposed Changes

### Build Configuration

#### [MODIFY] [app/build.gradle.kts](file:///Users/timileyinsonibare/Documents/Android-courses/app/build.gradle.kts)
- Apply the `kotlin-serialization` plugin in the `plugins` block.

## Verification Plan

### Automated Tests
- Run `./gradlew app:assembleDebug` to ensure the build still passes.
- Deploy the app to the emulator and verify that it no longer crashes on startup.

### Manual Verification
- I will use `read_logcat` to confirm the `SerializationException` is gone after the fix.
