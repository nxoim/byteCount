This is a helper utility for defining the size of things in storage with syntax similar to kotlin `Duration`

Example:
```kotlin
val cacheSize = 2.petabytes

// somewhere in the codebase
Something.Builder()
    .setCacheSize(maxSizeMb = cacheSize.inWholeMebibytes)
```