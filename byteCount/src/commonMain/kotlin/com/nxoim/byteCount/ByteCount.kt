package com.nxoim.byteCount

import kotlin.jvm.JvmInline

@JvmInline
value class ByteCount(val bytes: Long) {
    override fun toString() = "$bytes bytes"

    val inWholeBytes get() = bytes
    val inWholeKilobytes get() = bytes / 1_000
    val inWholeMegabytes get() = bytes / 1_000_000
    val inWholeGigabytes get() = bytes / 1_000_000_000
    val inWholeTerabytes get() = bytes / 1_000_000_000_000
    val inWholePetabytes get() = bytes / 1_000_000_000_000_000

    val inWholeKibibytes get() = bytes / 1024
    val inWholeMebibytes get() = bytes / 1_048_576
    val inWholeGibibytes get() = bytes / 1_073_741_824
    val inWholeTebibytes get() = bytes / 1_099_511_627_776
    val inWholePebibytes get() = bytes / 1_125_899_906_842_624
}

val Number.bytes get() = ByteCount(this.toLong())

val Number.kilobytes get() = ByteCount(this.toLong() * 1_000)
val Number.megabytes get() = ByteCount(this.toLong() * 1_000_000)
val Number.gigabytes get() = ByteCount(this.toLong() * 1_000_000_000)
val Number.terabytes get() = ByteCount(this.toLong() * 1_000_000_000_000)
val Number.petabytes get() = ByteCount(this.toLong() * 1_000_000_000_000_000)

val Number.kibibytes get() = ByteCount(this.toLong() * 1024)
val Number.mebibytes get() = ByteCount(this.toLong() * 1_048_576)
val Number.gibibytes get() = ByteCount(this.toLong() * 1_073_741_824)
val Number.tebibytes get() = ByteCount(this.toLong() * 1_099_511_627_776)
val Number.pebibytes get() = ByteCount(this.toLong() * 1_125_899_906_842_624)