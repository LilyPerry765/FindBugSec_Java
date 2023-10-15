import scala.util.Random

def generateSecretToken() {
    val result = Seq.fill(16)(Random.nextInt)
    return result.map("%02x" format _).mkString
}
//CWE-330: Use of Insufficiently Random Values
