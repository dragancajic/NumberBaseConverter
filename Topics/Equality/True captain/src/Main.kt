// you do not need to understand how it works, ignore it
class Pirate(name: String) {
    var name: String = name
        private set
}

fun main() {
    var captain = Pirate("Hector Barbossa")
    println(captain.name)
    // Do not touch the lines above
    // put your code here
    captain = Pirate("Jack Sparrow")
    println(captain.name)
}
