/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() = println("$name, ${if (sleep) "sleep" else "let's play"}!")
}

fun main() {

    // TODO 2
    Cat("Gippy").apply {
        toSleep()
        sleep = true
        toSleep()
    }
}