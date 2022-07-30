package com.a7medkenawy.designpatternslessons.behavioral.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}

interface Container {
    fun iterator(): Iterator
}

class RepositoryContainCollectionOfDataType : Container {

    var myArray = arrayOf("Ahmed", "Saad", "Kenawy", "Hassan")

    override fun iterator(): Iterator {
        return CollectionIterator()
    }

    inner class CollectionIterator() : Iterator {
        var index = 0
        override fun hasNext(): Boolean {
            return index < myArray.size
        }

        override fun next(): Any {
            return if (hasNext())
                myArray[index++]
            else
                null!!
        }

    }
}

fun main() {
    var repo = RepositoryContainCollectionOfDataType()
    var iterator = repo.CollectionIterator()
    while (iterator.hasNext()) {
        val name = iterator.next() as String
        println("Name : $name")
    }
}

