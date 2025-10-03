```mermaid
classDiagram
    class Iphone {
        +main(String[] args)
    }

    class IpodMusic {
        +play()
        +pause()
        +next()
        +previous()
    }

    class Phone {
        +call(number: String)
        +answer()
        +endCall()
    }

    class Browser {
        +openUrl(url: String)
        +refresh()
        +back()
    }

    class Email {
        +sendEmail(to: String, subject: String, body: String)
        +receiveEmail()
    }

    Iphone --> IpodMusic : usa
    Iphone --> Phone : usa
    Iphone --> Browser : usa
    Iphone --> Email : usa
