
fun main() {
    val timeLast:UInt = 75599U     // Time since last online visit
    println(agoToText(timeLast))
}
fun agoToText(timeL:UInt) :String {
    var message:String = ""
    val timeLastMin:UInt = (timeL/60U).toUInt()        // "timeLast" in minutes
    val timeLastHour:UInt = (timeL/3600U).toUInt()         // "timeLast" in hours
    when (timeL){
        in 0u..60u ->  message = "был(а) только что"   // seconds processing
        in 61U..3600U ->                           //  minutes processing
            message = when {

                timeLastMin / 10U == 1U -> "был(а) $timeLastMin минут назад"

                timeLastMin % 10U == 1U -> "был(а) $timeLastMin минуту назад"

                timeLastMin % 10U in 2U..4U -> "был(а) $timeLastMin минуты назад"

                timeLastMin % 10U in 5U..9U -> "был(а) $timeLastMin минут назад"

                timeLastMin % 10U == 0U -> "был(а) $timeLastMin минут назад"
                else -> {""}
            }
        in 3601U.. 86399U -> {          // Hours processing
            message = when {
                timeLastHour == 1U -> "был(а) $timeLastHour час назад"
                timeLastHour == 21U -> "был(а) $timeLastHour час назад"

                timeLastHour in 2U..4U -> "был(а) $timeLastHour часа назад"

                timeLastHour in 22U..23U -> "был(а) $timeLastHour часа назад"

                timeLastHour in 5U..20U -> "был(а) $timeLastHour часов назад"
                else -> {
                    ""
                }
            }
        }

        else -> {         // Days processing
            message = when{
                timeL in 86400U..172799U -> "был(а) вчера"
                timeL in 172800U..259199U -> "был(а) позавчера"
                else -> "был(а) давно"
            }

        }


    }
    return message
}