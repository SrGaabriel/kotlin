/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

// 1104 ranges totally
private object CategoryRangesWrapper {
    private const val toBase64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
    internal val fromBase64 = IntArray(128).apply { toBase64.forEachIndexed { index, char -> this[char.toInt()] = index } }

    internal val rangeStart = "AAAAIAAjACcAKwAuADEAOgA9AEAAQwBbAF4AYQB7AH4AgQCgAKMApgCqAK0AsACzALYAuQC9AMAA1wDaAN8A9wD6AQABOAFJAXkBfwGCAYcBiwGPAZIBmAGbAaMBpwGrAa8BswG4AbsBvgHBAcQBzgHdAfAB9QH4AjQCOgJAAkQCRwKUApcCsALCAsYC0gLgAuUC7ALwA3ADdAN3A3oDfQOEA4cDigOOA5MDowOsA88D0wPWA9oD8AP0A/kD/AP/BDAEYASCBIUEiASLBMEFMQVZBVwFYAWJBY0FkQW+BcEF0AXvBfMGAAYGBgkGDgYRBhsGHwYiBkAGQwZLBmAGagZuBtQG1wbdBuAG5QboBuwG7wbyBvoG/QcABw8HEgcwB6YHsQfAB8oH6wf0B/cH+gf9CAAIFggaCB0IJAgnCCsIMAhACFkIXghhCKAItgjTCOII5QkDCQYJOgk9CUAJQwlJCU0JUAlTCVgJYgllCWgJcAlzCYEJhQmPCZMJqgmyCbYJvAm/CcIJxwnLCc4J1wncCeEJ5gnwCfMJ9gn6Cf0KAQoFCg8KEwoqCjIKOAo8Cj8KQgpHCksKUQpZCl4KZgpwCnMKdgqBCoUKjwqTCqoKsgq3CrwKvwrCCscKywrQCuAK4wrmCvAK+Qr8CwELBQsPCxMLKgsyCzcLPAtAC0MLRwtLC1ULXAthC2YLcAtzC4ILhQuOC5ILmQueC6MLqAuuC74LxgvKC80L0AvXC+YL8AvzC/kMAAwDDAYMDgwSDCoMPQxADEMMRgxKDFUMWAxgDGMMZgx3DHoMfwyCDIUMjgySDKoMtQy8DMAMxgzKDM0M1QzeDOIM5gzxDQANAw0GDQ4NEg07DT4NQQ1GDUoNTQ1UDVcNWg1fDWINZg1wDXkNfA2BDYUNmg2zDb0NwQ3KDc8N0g3WDdkN5g3yDgEOMQ41Dj8OQg5GDkkOTw5SDloOgQ6GDowOpQ6pDrEOtQ69DsEOxg7JDtAO3A8ADwMPBg8TDxcPGw8gDyoPNA86Dz4PQQ9JD3EPfw+CD4UPiA+ND5kPvg/GD8kPzg/RD9UP2RAAECsQLhAxEDQQOBA8ED8QQhBKEFAQVhBZEFwQXxBiEGUQaBBuEHEQdRCCEIYQiRCNEJAQmhCdEKAQxxDNENAQ+xD+EkoSUBJYElwSYBKKEpASshK4EsASxBLIEtgTEhNdE2ATaROAE5AT+BQAFm0WcBaAFoMWmxbrFu4W8RcAFw4XEhcgFzIXNRdAF1IXYBduF3IXgBe0F7kXvhfGF8oX1BfXF9oX3RfgF/AYABgGGAkYDBgQGCAYQxhGGIAYhRiIGKkZABkgGSMZJxkqGTAZNRk5GUAZRBlHGVAZcBmAGbAZ0BnaGd4aABoXGhoaHhohGlUaWRpgGmQaZxptGnMafxqCGpAaoBqnGqoasBq+GwAbBBsHGzQbOBs7Gz8bQhtFG1AbWhthG2sbdBuAG4MboRukG6cbrRuwG7ob5hvrG+8b8hv8HAAcJBwsHDQcNxw7HEAcTRxQHFoceBx+HIEckBy9HMAc0BzTHNYc4RzkHOkc7RzwHPQc9xz6HQAdLB1rHXgdex2bHcAd+x6WHwAfCB8QHxgfIB8oHzAfOB9AH0gfUB9ZH10fYB9oH3AfgB+IH5AfmB+gH6gfsB+2H7kfvB+/H8Ifxh/JH8wfzx/SH9Yf2R/dH+Af6B/tH/If9h/5H/wgACALIBAgFiAZIBwgICAoICsgLyAyIDkgPCA/IEIgRSBIIFIgVSBfIGIgZiBwIHQgeiB9IIAgiiCNIJAgoCDQIN0g4SDkIOchACEFIQohDSERIRQhGCEbIR4hJCErIS4hMSE0ITchOiE9IUAhRSFIIUshTiFRIWAhgyGGIYkhkCGVIZohnSGgIakhriGxIc4h0SHWIwAjCCMMIyAjIyMpI3wjfyObI7Qj3CRAJGAk6iW3JbolwSXEJfgmbydoJ3YnlCfAJ8UnyCfmJ/ApgymZKdgp3Cn8KwArMCtFK0grTSt2LAAsMCxgLGQsaSxuLHEseCx8LH8s5CznLOss7yzyLPks/S0ALSctLS0wLW8tfy2CLaAtqC2wLbgtwC3ILdAt2C3gLgAuAy4GLgkuDy4XLhwuHy4iLiouLy4yLjouPS5ALkMuUC6AL/AwADADMAYwCTASMBUwHDAfMCIwKjAuMDEwNjA5MDwwPzCZMJwwnzD7MP4xBTGQMZMxljGgMcAx8DIAMiAyKjJIMlAyUzJgMoAyijKxoACgFaSQpNCk+KT+pgymD6YSpiCmKqZApm6mcaZ0pn6mgaacpp+m5qbwpvOnAKcXpyCnI6cwpzSncKdzp3mnfqeIp4unj6eSp5Wnq6evp7KntafCp8anyqf1p/in+6gCqAWoCagOqCOoJqgpqCyoMKg2qECodKiAqIOotKjEqM6o0ajgqPKo+Kj7qP+pAqkKqSapLqkxqUepUqlfqWKpgKmDqYaps6m3qbqpvanAqcOpz6nSqd6p4anlqeip8Kn6qgCqKaovqjKqNqpAqkOqRqpMqlCqXKpgqnCqc6p3qnqqfaqAqrCqtKq4qruqvqrCqtuq3qrhquuq76ryqvWrAasJqxGrIKsoqzCrW6teq2GraavAq+Or66vw17DXy/sA+xP7Hfsh+yn7LPs4+z77Q/uy/T79kv3w/fz+AP4Q/hf+IP4w/jP+Nv5F/kj+S/5O/lH+Vv5Z/l/+Yv5m/mn+cP7//wL/B/8L/w7/Ef8a/x3/IP8j/zv/Pv9B/1v/Xv9h/2X/aP9w/3P/nv+h/8L/yv/S/9r/4P/j/+b/6f/t//n//A=="

    internal val rangeLength = "gDEEDDJDDDYDDaDDfDDEDDDDDEDXDFYDG4RwGDFEEDGDIEEEEFDDDDKPTFD8GGEDJDZSEMOFHEQEDBDDDDDFPJjEDEWEFDDxwiDDD2OmDEpCDtDHbECGDFDKEDeDIVKEFDGDFDEDDIDDODebLBKhJDDBDWEDHDEDPZDDKVSPDeD0DDDGEDDFKDDIDODICWHBEDDDCDBBFDKDDEDCDGCWHFCDDBCDBEBKDDBDJDWHFDDDEDDBDBKCDEDICWHFDEDCCDDFDKDFCGDEECCDMFDDBBBKDGCDDHDXQDDCDECDDBKDFDDIDXKFEFDDBCECKCDDHDpDDEDDDDDFDCKJDEDSYJEGBDDDHKDwEGDEDGDICEFYEIEIEEDFKEDDNEEFKKGEDHkODDDFLkIDEDEECrDDDEEDDIGGDDDDDDGDENEDEDKDDmBBrDDEHECpEhEHECP5EDJUQKGDDQDYCDDINEDSDCSCNDC0FFIEKDDDBKKGDDDKjDzFDhCfDEDCFEDBDJeFsaKBiXDCD0EGEDGGKDIKHDEODEDtEDEDDHKHKJJDeDDGDKsFEDCEkIIDBFKDKeGDIrDIDDLDFEDEDDBs/NDgl6FIIIGGIIIIGGIDDIIOIIIIIIFDDDDDDDDDCDDDIFDDDDDLFGDDEIDEDHDDDDDKDKDDKCGDDKDCNgNEDDKFFDEDEDDGHDDDDDDDFDDDDPjDDDFFDDJFDdDFeIEUDGDDcZoGL8WDHD0IDOesFDeKQW/EgDwVDFngvvEFFDHEDEDEEDCEDmBB4CDVHHHHHHHHgDDDGIFDDIFDIDDDNDaMDDDJDHDDIEDFDDDDDDEDCrDDKgkQfKeIDNgKnPVD3oGDDDOKCuDDKDbDDKDFXJDNE8DGFKDEDDWEDDLEEBDDHDEFVDDDBGE0EDxQCDJSGDEDIcIDWLCDbDDtEDDDDLDIDEDIKFpGDEBDDGCKEQDEDDDwEEDDEBDDKEDDCGGGHHrDDIDjIDKXxHFEIDLFEFQC2MCQHDQDDPDDDDFDGDEDDFDFEDDJDDDYDDaDDEDIDrDeGGGDDDDECDC"

    internal val categoryOfRange = "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"

    internal val longRangeStart = "AlADAATPBnMHTREBExgToBQDFqAYsB4AHp4h9CMsI+IknCUAJgAmcigAKQAp/yuXLIMumy8AMEIwozExMsA0AE3ATgCgGKUBpqKrcKwA2ADbgNwA4AD5APpw+0j70/1Q/nY="

    internal val longRangeLength = "AEQAcABhAGEAWQFIAEMAVgJqAEsARgCWAGIBDABQAEUATgC3AG8A9gEAAIMBAQBpAGEAWQDWAFUAWABeAUAZwABAUf0EdQELAEQAUCukA4AAgAQAGQABbgBqAGoBawBAAIc="

    internal val categoryOfLongRange = "AAIABgBBAAUABQAFAAUAAQAFAAUABQBBAEEAGQAcABwAHAAcABwAHAAcABkAGQAcAEEAHAAcAAUABQAFABwABQAcAAUABQAFAAUAAgAFABMAEwATABIABQAFAAUABQAFAAU="
}

private fun binarySearchRange(rangeStart: String, needle: Int): Int {
    var bottom = 0
    val padding = if (rangeStart[rangeStart.length - 2] == '=') 2 else if (rangeStart[rangeStart.length - 1] == '=') 1 else 0
    var top = (((rangeStart.length - padding) * 6) - 2 * padding) / 16 - 1
    var middle = -1
    var value = 0
    while (bottom <= top) {
        middle = (bottom + top) / 2
        value = intFromBase64(rangeStart, middle)
        if (needle > value)
            bottom = middle + 1
        else if (needle == value)
            return middle
        else
            top = middle - 1
    }
    return middle - (if (needle < value) 1 else 0)
}

private fun intFromBase64(string: String, index: Int): Int {
    val fromBase64 = CategoryRangesWrapper.fromBase64
    val stringIndex = (index / 3) * 8
    return when (index % 3) {
        0 -> (fromBase64[string[stringIndex].toInt()] shl 10) or
                (fromBase64[string[stringIndex + 1].toInt()] shl 4) or
                (fromBase64[string[stringIndex + 2].toInt()] shr 2)

        1 -> ((fromBase64[string[stringIndex + 2].toInt()] and 0b11) shl 14) or
                (fromBase64[string[stringIndex + 3].toInt()] shl 8) or
                (fromBase64[string[stringIndex + 4].toInt()] shl 2) or
                (fromBase64[string[stringIndex + 5].toInt()] shr 4)

        2 -> ((fromBase64[string[stringIndex + 5].toInt()] and 0b1111) shl 12) or
                (fromBase64[string[stringIndex + 6].toInt()] shl 6) or
                (fromBase64[string[stringIndex + 7].toInt()])

        else -> error("Unreachable")
    }
}

private fun categoryValueFrom(code: Int, ch: Int): Int {
    return when {
        code < 0x20 -> code
        code < 0x400 -> if ((ch and 1) == 1) code shr 5 else code and 0x1f
        else ->
            when (ch % 3) {
                2 -> code shr 10
                1 -> (code shr 5) and 0x1f
                else -> code and 0x1f
            }
    }
}

/**
 * Returns the Unicode general category of this character as an Int.
 */
internal fun Char.getCategoryValue(): Int {
    val ch = this.toInt()
    var value = CharCategory.UNASSIGNED.value
    
    var index = binarySearchRange(CategoryRangesWrapper.rangeStart, ch)
    var start = intFromBase64(CategoryRangesWrapper.rangeStart, index)
    var length = CategoryRangesWrapper.fromBase64[CategoryRangesWrapper.rangeLength[index].toInt()]
    
    if (ch < start + length) {
        val code = intFromBase64(CategoryRangesWrapper.categoryOfRange, index)
        value = categoryValueFrom(code, ch)
    } else {
        index = binarySearchRange(CategoryRangesWrapper.longRangeStart, ch)
        start = intFromBase64(CategoryRangesWrapper.longRangeStart, index)
        length = intFromBase64(CategoryRangesWrapper.longRangeLength, index)
        
        if (ch < start + length) {
            val code = intFromBase64(CategoryRangesWrapper.categoryOfLongRange, index)
            value = categoryValueFrom(code, ch)
        }
    }
    
    return if (value == 17) CharCategory.UNASSIGNED.value else value
}
