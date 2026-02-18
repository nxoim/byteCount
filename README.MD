This is a helper utility for defining the size of things in storage with syntax similar to kotlin `Duration`
Written for minimal overhead (if any). Supported on all platforms.

Examples:
```kotlin
val cacheSize = 2.petabytes

// somewhere in the codebase
Something.Builder()
    .setCacheSize(maxSizeMb = cacheSize.inWholeMebibytes)
```

```kotlin
fun main() {
    val availableStorage = 2.gigabytes
    val storageBrokenDown = availableStorage.toReadableString()

    println("Available storage: $storageBrokenDown")
}

fun ByteCount.toReadableString() = this.toDecimalComponents { megabytes, kilobytes, bytes ->
    "$megabytes MB $kilobytes KB"
}
```

Installation: copy and paste the files into your project into 
your module of choice. 

A platform utility is used for multiplication, so make sure to 
copy the platform specific files (android, jvm, native, wasm folders)