
/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1

    val vehicle = mapOf(
            "Type" to "Motorcycle",
            "Speed" to "230Km/s",
            "Tank" to "10Ltr"

    )

    // TODO 2
    val type = vehicle.getValue("Type")
    val maxSpeed = vehicle.getValue("Speed")
    val maxTank = vehicle.getValue("Tank")

    // TODO 3
    println("Vehicle")
    println("Type: $type" )
    println("Maximal Speed: $maxSpeed" )
    println("Maximal Tank: $maxTank" )

}