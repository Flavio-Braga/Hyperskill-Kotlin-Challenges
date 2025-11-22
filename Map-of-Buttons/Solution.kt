fun main() {

    val iterator1 = readln().iterator()
    val iterator2 = readln().iterator()

    while (iterator1.hasNext()) {

        print(iterator1.next())

        if (iterator2.hasNext()) {
            print(iterator2.next())
        }
    }

    while (iterator2.hasNext()) {
        print(iterator2.next())
    }

}