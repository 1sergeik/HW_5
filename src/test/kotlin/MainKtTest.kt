import org.junit.Test
import junit.framework.TestCase.assertEquals

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun agoToText0() {
        assertEquals(" не сработал на  10 сек","был(а) только что", agoToText(10U))
        assertEquals("не сработал на 30 сек","был(а) только что", agoToText(30U))
        assertEquals(" не сработал на  0 сек","был(а) только что", agoToText(0U))
        assertEquals(" не сработал на  60 сек","был(а) только что", agoToText(60U))

        assertEquals("не сработал на 61 секунде","был(а) 1 минуту назад", agoToText(61U))
        assertEquals("не сработал на 1265 секунде","был(а) 21 минуту назад", agoToText(1265U))
        assertEquals("не сработал на  3060 секунде","был(а) 51 минуту назад", agoToText(3060U))
        assertEquals("не сработал на 120 секунде","был(а) 2 минуты назад", agoToText(120U))
        assertEquals("не сработал на 1955 секунде","был(а) 32 минуты назад", agoToText(1955U))
        assertEquals("не сработал на 3179 секунде","был(а) 52 минуты назад", agoToText(3179U))
        assertEquals("не сработал на 359 секунде","был(а) 5 минут назад", agoToText(359U))
        assertEquals("не сработал на 2159 секунде","был(а) 35 минут назад", agoToText(2159U))
        assertEquals("не сработал на 3359 секунде","был(а) 55 минут назад", agoToText(3359U))
        assertEquals("не сработал на 660 секунде","был(а) 11 минут назад", agoToText(660U))
        assertEquals("не сработал на 850 секунде","был(а) 14 минут назад", agoToText(850U))
        assertEquals("не сработал на 3600 секунде","был(а) 60 минут назад", agoToText(3600U))


        assertEquals("не сработал на 3601 секунде","был(а) 1 час назад", agoToText(3601U))
        assertEquals("не сработал на 7199 секунде","был(а) 1 час назад", agoToText(7199U))
        assertEquals("не сработал на 75600 секунде","был(а) 21 час назад", agoToText(75600U))
        assertEquals("не сработал на 79199 секунде","был(а) 21 час назад", agoToText(79199U))

        assertEquals("не сработал на 7200 секунде","был(а) 2 часа назад", agoToText(7200U))
        assertEquals("не сработал на 12600 секунде","был(а) 3 часа назад", agoToText(12600U))
        assertEquals("не сработал на 17999 секунде","был(а) 4 часа назад", agoToText(17999U))

        assertEquals("не сработал на 79200 секунде","был(а) 22 часа назад", agoToText(79200U))
        assertEquals("не сработал на 86399 секунде","был(а) 23 часа назад", agoToText(86399U))

        assertEquals("не сработал на 18000 секунде","был(а) 5 часов назад", agoToText(18000U))
        assertEquals("не сработал на 44280 секунде","был(а) 12 часов назад", agoToText(44280U))
        assertEquals("не сработал на 75599 секунде","был(а) 20 часов назад", agoToText(75599U))

        assertEquals("не сработал на 86400 секунде","был(а) вчера", agoToText(86400U))
        assertEquals("не сработал на 100000 секунде","был(а) вчера", agoToText(100000U))
        assertEquals("не сработал на 172799 секунде","был(а) вчера", agoToText(172799U))

        assertEquals("не сработал на 172800 секунде","был(а) позавчера", agoToText(172800U))
        assertEquals("не сработал на 200000 секунде","был(а) позавчера", agoToText(200000U))
        assertEquals("не сработал на 259199 секунде","был(а) позавчера", agoToText(259199U))

        assertEquals("не сработал на 259200 секунде","был(а) давно", agoToText(259200U))
        assertEquals("не сработал на 3594000 секунде","был(а) давно", agoToText(3594000U))







    }

}