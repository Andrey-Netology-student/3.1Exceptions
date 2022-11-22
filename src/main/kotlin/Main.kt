import java.io.FileInputStream
fun main(args: Array<String>) {
    val attachment: Attachment = VideoAttachment("Stuff")
    //println(attachment.type) //Возвращает тип вложения (видео)
    val test = "first" to "second"
    println(test)
}
//gradle test jacocoTestReport